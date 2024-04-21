package queue;

public class CircularQueue<T> {
    private T[] queue;
    private int front;
    private int rear;
    private int size;

    // Constructor to initialize the queue
    @SuppressWarnings("unchecked")
    public CircularQueue(int size) {
        this.size = size;
        queue = (T[]) new Object[size];
        front = -1;
        rear = -1;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Method to add an element to the queue
    public void enqueue(T element) throws IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            queue[rear] = element;
        }
    }

    // Method to remove an element from the queue
    public T dequeue() {
        T element = null;
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        } else {
            element = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
        }
        return element;
    }

    // Method to display all elements in the queue
    public void displayAllElements() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            int i = front;
            System.out.print("Queue elements: ");
            while (true) {
                System.out.print(queue[i] + " ");
                if (i == rear) {
                    break;
                }
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        CircularQueue<Integer> queue = new CircularQueue<>(5);

        try {
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.displayAllElements(); // Display: 10 20 30 40

            queue.dequeue();
            queue.dequeue();
            queue.enqueue(50);
            queue.enqueue(60);
            queue.displayAllElements(); // Display: 30 40 50 60

            queue.enqueue(70); // This will throw an exception as the queue is full
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


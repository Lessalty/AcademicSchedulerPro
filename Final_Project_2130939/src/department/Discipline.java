package department;

public class Discipline {
    private String name;

    // Constructor
    public Discipline(String name) {
        this.name = name;
    }

    // Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Display method
    public void display() {
        System.out.println("Discipline: " + name);
    }
}


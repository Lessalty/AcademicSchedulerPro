package match;

import department.Department;
import department.Professor;
import java.util.PriorityQueue;
import java.util.Date;

import java.util.PriorityQueue;

public class Matcher {
    private PriorityQueue<Professor> profProcessingQueue;
    private Department department;

    public Matcher(Department department) {
        this.department = department;
        this.profProcessingQueue = new PriorityQueue<>();
    }

    public void processAssignments() {
        while (!profProcessingQueue.isEmpty()) {
            Professor professor = profProcessingQueue.poll();
            CourseAssignment.process(professor, department);
        }
    }

    public void addProfessorToQueue(Professor professor) {
        profProcessingQueue.add(professor);
    }

    public static void main(String[] args) {
        Department department = new Department();
        Matcher matcher = new Matcher(department);

        // Simulating adding professors and processing assignments
        // Normally you'd load this data from a file or user input
        matcher.addProfessorToQueue(new Professor(1, "John Doe", 15.5, new Date()));
        matcher.processAssignments();
    }
}


package department;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Department {
    private Map<String, Course> courseMap;
    private List<Professor> professors;

    public Department() {
        this.courseMap = new HashMap<>();
        this.professors = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courseMap.put(course.getId(), course);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void displayCourses() {
        for (Course course : courseMap.values()) {
            course.display();
        }
    }
    public List<Course> getCourses() {
        return new ArrayList<>(courseMap.values());
    }

    public void displayProfessors() {
        for (Professor professor : professors) {
            System.out.println(professor);
        }
    }
}

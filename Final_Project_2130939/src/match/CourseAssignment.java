package match;
import department.Course;
import department.Professor;
import department.Department;


public class CourseAssignment {

    public static void process(Professor professor, Department department) {
        for (Course course : department.getCourses()) {
            if (professor.getDisciplines().contains(course.getDiscipline()) && course.getNumOfGroups() > 0) {
                professor.addCourse(course);
                course.setNumOfGroups(course.getNumOfGroups() - 1);
                System.out.println("Assigned " + course.getTitle() + " to " + professor.getName());
            }
        }
    }
}

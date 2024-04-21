package department;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professor implements Comparable<Professor> {
    private int id;
    private String name;
    private double seniority;
    private Date hiringDate;
    private List<String> disciplines;
    private List<Course> affectedCourses;
    
    public String getName() {
        return name;
    }

    public Professor(int id, String name, double seniority, Date hiringDate) {
        this.id = id;
        this.name = name;
        this.seniority = seniority;
        this.hiringDate = hiringDate;
        this.disciplines = new ArrayList<>();
        this.affectedCourses = new ArrayList<>();
    }

    public void addDiscipline(String discipline) {
        disciplines.add(discipline);
    }

    public void addCourse(Course course) {
        affectedCourses.add(new Course(course));  // Using the copy constructor
    }
    
    public List<String> getDisciplines() {
        // Assuming there is a List<String> for disciplines
        return disciplines;
    }

    @Override
    public int compareTo(Professor other) {
        if (this.seniority != other.seniority) {
            return Double.compare(this.seniority, other.seniority);
        } else {
            return this.hiringDate.compareTo(other.hiringDate);
        }
    }

    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seniority=" + seniority +
                ", hiringDate=" + hiringDate +
                ", disciplines=" + disciplines +
                ", affectedCourses=" + affectedCourses +
                '}';
    }
}


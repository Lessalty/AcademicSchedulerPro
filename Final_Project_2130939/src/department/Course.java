package department;

public class Course {
    private String id;
    private String title;
    private String discipline;
    private int numberOfHours;
    private int numOfGroups;

    // Constructor
    public Course(String id, String title, String discipline, int numberOfHours, int numOfGroups) {
        this.id = id;
        this.title = title;
        this.discipline = discipline;
        this.numberOfHours = numberOfHours;
        this.numOfGroups = numOfGroups;
    }

    // Copy constructor
    public Course(Course another) {
        this.id = another.id;
        this.title = another.title;
        this.discipline = another.discipline;
        this.numberOfHours = another.numberOfHours;
        this.numOfGroups = another.numOfGroups;
    }

    // Getter and setter methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public int getNumOfGroups() {
        return numOfGroups;
    }

    public void setNumOfGroups(int numOfGroups) {
        this.numOfGroups = numOfGroups;
    }

    // Method to display course details
    public void display() {
        System.out.println("Course ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Discipline: " + discipline);
        System.out.println("Number of Hours: " + numberOfHours);
        System.out.println("Number of Groups: " + numOfGroups);
    }
}


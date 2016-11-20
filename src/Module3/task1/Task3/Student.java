package Module3.task1.Task3;

/**
 * Created by aleks_000 on 20.11.2016.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private Course[] courseTaken;
    private int age;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName, Course[] courseTaken) {
        this.lastName = lastName;
        this.courseTaken = courseTaken;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getGroup() {
        return group;
    }
    public void setGroup(int group) {
        this.group = group;
    }
    public Course[] getCoursesTaken() {
        return courseTaken;
    }
    public void setCoursesTaken(Course[] coursesTaken) {
        this.courseTaken = coursesTaken;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}


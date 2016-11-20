package Module3.task1.Task3;

/**
 * Created by aleks_000 on 20.11.2016.
 */
public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String eMail;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }
    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }
    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return eMail;
    }

    public void setEmail(String email) {
        this.eMail = email;
    }
}

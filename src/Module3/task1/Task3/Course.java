package Module3.task1.Task3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by aleks_000 on 20.11.2016.
 */
public class Course {
    private Date startDate;
    private String name;
    private int hourDuration;
    private String teacherName;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(int hourDuration, String name, String teachName) {
        this.hourDuration = hourDuration;
        this.name = name;
        this.teacherName = teachName;

    }
    @Override
    public String toString() {
        if (startDate == null) {
            return name + " (" + hourDuration + "hour by Pr." + teacherName + ")";
        } else {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            return dateFormat.format(startDate) + " " + name;
        }
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHourDuration(){
        return hourDuration;
    }
    public void setHoursDuration(int hourDuration) {
        this.hourDuration = hourDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}


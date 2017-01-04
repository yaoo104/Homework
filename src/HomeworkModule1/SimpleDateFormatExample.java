package HomeworkModule1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by aleks_000 on 04.01.2017.
 */
public class SimpleDateFormatExample {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        System.out.println("date: " + dateFormat.format( new Date() ) );

    }
}

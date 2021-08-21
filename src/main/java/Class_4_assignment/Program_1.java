package Class_4_assignment;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CheckedOutputStream;

public class Program_1 {

    public static void main(String[] args) throws ParseException {

       // 1. Find the date difference (year, day, hour, min, sec) between your birthdate and today

        // date of birth
        LocalDate pdate = LocalDate.of(1994, 10, 02);
        LocalTime pTime = LocalTime.of(5,10,33);

        // current date
        LocalDate now = LocalDate.now();
        LocalTime ltime = LocalTime.now();

        // difference between current date and date of birth
        Period diff = Period.between(pdate, now);
       //Period difft = Time.from(pTime, now);

        System.out.printf("\nI am  %d years, %d months and %d days old.\n\n", diff.getYears(), diff.getMonths(), diff.getDays());
        //System.out.printf("\nI am  %d years, %d months and %d days old.\n\n", pTime.getHour(), pTime.getMinute(), pTime.getSecond());










    }
}

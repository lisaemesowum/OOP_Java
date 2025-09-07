package InterfaceOOP.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateDemo {
    public static void main(String[] args){
        //This is for current date  LocalDate = (year , month, day)
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //LocalTime = (hours , minutes , seconds , nanoseconds)
        LocalTime Time = LocalTime.now();
        System.out.println(Time);

        //LocalDateTime  = (years , mouths , day , hours, min , seconds , nanoseconds.)
        LocalDateTime DateNTime = LocalDateTime.now();
        System.out.println(DateNTime);

    }
}

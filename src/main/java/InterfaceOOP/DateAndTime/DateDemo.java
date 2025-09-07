package InterfaceOOP.DateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateDemo {
    public static void main(String[] args){
        //This is for current date  LocalDate = (year , month, day)
        LocalDate date = LocalDate.now();
//        System.out.println(date);

        //LocalTime = (hours , minutes , seconds , nanoseconds)
        LocalTime Time = LocalTime.now();
//        System.out.println(Time);

        //LocalDateTime  = (years , mouths , day , hours, min , seconds , nanoseconds.)
        LocalDateTime DateNTime = LocalDateTime.now();
//        System.out.println(DateNTime);

        //UTC Time >Coordinated Universal Time  (independent of your system’s local timezone.)
        Instant  UTC = Instant.now();
//        System.out.println(UTC);

        // OR YOU USE
        ZonedDateTime UtcTime = ZonedDateTime.now();
//        System.out.println( "UTC Zoned Time: " + UtcTime);

        // WE NEED TO CREATE A CUSTOM FORMAT SO THE LOCALDATE AND LOCALTIME WITH UTC WILL BE EASY TO READ I MEAN THE
        // OUTPUT OF THE OTHER CODE DATE AND TIME WAS LIKE THIS  2025-09-07T10:27:57.357224700Z UTC Zoned Time: 2025-09-07T11:27:57.359223900+01:00[Africa/Lagos]

//        SO LETS CUSTOMIZE THE DATE AND TIME

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        //create a new string
        String newDateTime = dateTime.format(formatter);
//        System.out.println(newDateTime);


        // custom dateTime if we dont need the current date
        LocalDate dat = LocalDate.of(2003,1,22);
        System.out.println(dat);

        //custom time
        LocalTime time = LocalTime.of(2,22,2,0);
        System.out.println(time);

        //compare date
        LocalDateTime date1 = LocalDateTime.of(2003,1,22, 2,47,0);
        LocalDateTime date2 = LocalDateTime.of(2025, 9,7,11,48,0);
//        System.out.println(date1);
//        System.out.println(date2);
        if(date1.isBefore(date2)){
            System.out.println(date1 + " is earlier then " + date2);
        }
        else if(date1.isAfter(date2)){
            System.out.println(date1 + "is later then " + date2);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1 + "is equal to " + date2);
        }

    }
}

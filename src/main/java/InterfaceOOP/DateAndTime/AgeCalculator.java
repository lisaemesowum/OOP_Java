package InterfaceOOP.DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    //how to calculate the age of someone based on current date and
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate whenWasBorn = LocalDate.of(2003, 1, 22);

        // calculate the difference
        Period age = Period.between(whenWasBorn,today); //or int age = Period.between(whenWasBorn,today).getYears()
//        System.out.println(today);
//        System.out.println(whenWasBorn);

        System.out.println("Age: " + age.getYears() + "years");
        System.out.println("Age: " + age.getMonths() + "months");

        //check leap year
        LocalDate date = LocalDate.of(2025,9,7);
        // return true if it is leap year
        System.out.println(date.isLeapYear());
        LocalDate date2 = LocalDate.of(2020,9,25);
        System.out.println(date2.isLeapYear());

    }
}

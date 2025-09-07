package InterfaceOOP.DateAndTime;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDownTimer {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
//        int totalSeconds = 3600; // 1 hour = 3600 seconds fixed
        //take the input from user
        System.out.println("Enter countdown from: ");
        int user = input.nextInt();  //getting the next int from the user
        input.close();


        Timer time = new Timer();
        TimerTask task = new TimerTask() {   //defines what should run repeatedly (printing and counting down).
//            int count = totalSeconds;
            int count = user;


            @Override
            //count down with run
            public void run() {
                //real cooking clock:
                int hours = count / 3600;
//                int minutes = count / 60;
                int minutes = (count % 3600) / 60;
                int seconds = count % 60;

//                System.out.println();
                System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);   //print minutes and seconds as 2-digit numbers with leading zeros, separated by : and followed by a new line.
                count--; //Decreases the counter.
                //using the if method to check if count is less then 0
                if(count < 0){  //If the count is below 0, stops the timer.
                    System.out.println("Time is up");
                    //stop timer
                    time.cancel();
                }
            }
        };
        //this will take our time task execute it after the delay
        //Runs task.run() every 1000 ms = 1 second.
        time.scheduleAtFixedRate(task,0,1000); //(task,delay,period)  1000 every milliseconds perform your task

    }
}

package Lesson5HW;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a distance in km");
        int distance = in.nextInt();
        System.out.println("And time in hours");
        int time = in.nextInt();

        double speed = ((double) distance/time);
        double speedTwo = ((double) time/time);

        System.out.print("The speed in km per hour is ");
        System.out.print(speed);
        System.out.print("/");  
        System.out.print(speedTwo);



    }
}

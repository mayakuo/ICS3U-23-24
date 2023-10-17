package Lesson5HW;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print ("Please enter a temperature in Farenheit");
        int f = in.nextInt();

        double c = ((double)f-32)*5/9;
        System.out.println(f + " degrees F to C is " +c);
    }
}

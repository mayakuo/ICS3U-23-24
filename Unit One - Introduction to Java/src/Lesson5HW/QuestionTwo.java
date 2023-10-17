package Lesson5HW;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print ("Please enter a whole value of US currency  ");
        int us = in.nextInt();

        double c = ((double)us*1.25);
        System.out.println(us + " US dollars to Cad is " +c);
    }
}

package PracticeQuestions;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter a number");
        double number = in.nextDouble();

        double one = Math.pow(number,2);
        System.out.println(one);
    }
}

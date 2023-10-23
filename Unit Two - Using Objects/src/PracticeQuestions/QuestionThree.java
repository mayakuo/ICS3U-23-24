package PracticeQuestions;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter a number");
        double number = in.nextDouble();

        double one = Math.sqrt(number);
        System.out.println(one);
    }
}

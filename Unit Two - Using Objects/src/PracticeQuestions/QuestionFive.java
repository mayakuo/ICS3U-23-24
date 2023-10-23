package PracticeQuestions;

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String one = in.next();

        System.out.println("Enter a second string");
        String two = in.next();

        System.out.println(one.equals(two) + " that these strings are equal");

    }
}

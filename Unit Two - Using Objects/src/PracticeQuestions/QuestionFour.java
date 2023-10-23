package PracticeQuestions;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        
        String food = "cookie";

        Scanner in = new Scanner (System.in);

        System.out.println("Enter a starting index");
        int starting = in.nextInt();

        System.out.println ("Enter an ending index");
        int ending = in.nextInt();

        String result = food.substring(starting-1, ending-1);

        System.out.println(result);
    }
}

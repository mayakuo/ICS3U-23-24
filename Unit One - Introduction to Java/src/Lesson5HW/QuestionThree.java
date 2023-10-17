package Lesson5HW;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a radius whole number value ");
        int radius = in.nextInt();

        double area = ((double) 3.14*(radius*radius));
        double circumference = ((double) 2*3.14*radius);

        System.out.print("The area is " + area);
        System.out.print(" and the circumference is " + circumference);



    }
}

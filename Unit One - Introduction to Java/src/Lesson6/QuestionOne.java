package Lesson6;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length of the pool");
        int length = in.nextInt();
        System.out.println("Please enter the width of the pool");
        int width = in.nextInt();
        System.out.println("Please enter the depth of the shallow end");
        int shallowDepth = in.nextInt();
        System.out.println("Please enter the depth of the deep end");
        int deepDepth = in.nextInt();
        System.out.println("Please enter the length of the transition of the pool");
        int lengthTransition = in.nextInt();
        System.out.println("Please enter the length of the shallow end");
        int lengthShallow = in.nextInt();
        System.out.println("Please enter the price per meter squared of the liner");
        int priceLiner = in.nextInt();

        int shallowSideWallArea = shallowDepth * lengthShallow;
        int shallowVolume = shallowSideWallArea * width;

        int transitionHeight = 
        

    }
}

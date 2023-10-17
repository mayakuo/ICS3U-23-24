package TestReview;
import java.util.Scanner;
public class LessonSixPracticeProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length of the pool");
        int lengthOfPool = in.nextInt();
        System.out.println("Please enter the width of the pool");
        int widthOfPool = in.nextInt();
        System.out.println("Please enter the depth of the deep end");
        int depthOfDeep = in.nextInt();
        System.out.println("Please enter the depth of the shallow end");
        int depthOfShallow = in.nextInt();
        System.out.println("Please enter the length of the transition between the shallow and the deep end");
        int lengthOfTransition = in.nextInt();
        System.out.println("Please enter the length of the shallow end");
        int lengthOfShallow = in.nextInt();
        System.out.println("Please enter the price per meter squared of the pool");
        int priceOfLiner = in.nextInt();

        double volumeFirstRectangle = lengthOfShallow * widthOfPool * depthOfShallow;
        
        int cFirstTriangle = (depthOfShallow*depthOfShallow) * (lengthOfTransition*lengthOfTransition);
        int volumeFirstTriangle = cFirstTriangle * depthOfShallow *lengthOfTransition;

        int volumeSecondTriangle = 




    }
}

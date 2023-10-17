package Lesson4;

public class ExampleTwo {
    public static void main(String[] args) {
        //int x = 6.7;      //cannot assign a double into a int variable

        int x = (int) 6.7;      
        System.out.println(x);
        //double to int is a narrowing cast
        //int to double is a widening cast
    }
}

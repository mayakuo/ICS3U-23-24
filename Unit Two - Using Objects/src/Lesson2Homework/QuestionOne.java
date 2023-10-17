package Lesson2Homework;

public class QuestionOne {
    public static void main(String[] args) {
        
        String tag = "[[]]";
        String word = "Cookie";

        String result = tag.substring(0,2) + word + tag.substring(2);

        System.out.println(result);
    }
}

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizzerTester {

    public static boolean testMultipleChoiceQuestion() {
        MultipleChoiceQuestion multipleChoiceQuestion = new MultipleChoiceQuestion("Q1","What is the capital of Indiana?", new String[] {"Madison", "Boston", "Indianapolis", "Chicago"}, 2, 1);


        return true;
    }

    public static boolean testLinkedNode(){
        LinkedNode<String> linkedNode = new LinkedNode<String>("Hello");

        return true;
    }



    public static boolean runAllTests() {
        System.out.println("testMultipleChoiceQuestion: " + testMultipleChoiceQuestion());
        System.out.println("testLinkedNode: " + testLinkedNode());


        if (testMultipleChoiceQuestion() && testLinkedNode())return true;
        else return false;
    }

    public static void main(String[] args) {



    }

}


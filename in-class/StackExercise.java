package javaprojectaco;

import java.util.Stack;

public class StackExercise {
    
    public static void main(String[] args){
        //create Stack using built in Java class
        Stack<Integer> stack = new Stack<Integer>();
        //push elements into stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);        
        //call methods

        stackReverse(stack);
    }

    public static void stackReverse(Stack<Integer> stack) {
        

    }

    public static boolean stackPalindrome (Stack<String> stack) {
        String palindromeStack = "racecar";
        Stack<String> reverseStack = new Stack<String>();

        //pop off main stack
        for (int x=0; x < palindromeStack.length(); x++){
            

        }


        // push onto reverse stack

        // compare main and reverse
        

        return true;
    }


}

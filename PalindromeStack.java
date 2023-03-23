package week5;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeStack {
    private static String stringReverse(String inputString) {
        Stack<Character> charStack = new Stack<>();     //create a stack
        for (int i=0; i<inputString.length(); i++) {
            charStack.push(inputString.charAt(i));      //push the characters of string to the stack
        }
        StringBuilder result = new StringBuilder();     //create a new string
        while (!charStack.empty()) {
            result.append(charStack.pop());             //append the popped stack elements to the string
        }
        return result.toString();
    }
    public static boolean isPalindrome(String inputString) {    //check if the reversed input string equals to the input string
        return inputString.equalsIgnoreCase(stringReverse(inputString));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input String: ");
        String inputString = in.next();
        System.out.println("Palindrome: " + isPalindrome(inputString));
    }
}

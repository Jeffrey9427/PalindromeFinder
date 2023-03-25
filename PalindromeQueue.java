package week5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeQueue {
    private static String stringReverse(String inputString) {   //torment
        Queue<Character> charQueue = new LinkedList<>();     //create a queue
        for (int i=inputString.length()-1; i>=0; i--) {
            charQueue.offer(inputString.charAt(i));      //push the characters of string to the queue    tnemrot
        }
        StringBuilder result = new StringBuilder();     //create a new string
        while (!charQueue.isEmpty()) {
            result.append(charQueue.poll());             //append the first-added queue element to the string and popped it    torment
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

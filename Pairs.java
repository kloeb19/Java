package week04;
import java.io.*;
import java.util.*;

//Kathleen Loeb

public class Pairs {
	public static void main(String[] args) {
		   //create scanner 
	        Scanner input = new Scanner(System.in);
	       //receive input from user
	        System.out.println("Enter a file location: ");
	        //String to store filename
	        String filename = input.nextLine();
	        //create file
	        File file = new File(filename);
	
	       //create array to store filename
	        char[] charArray = new char[filename.length()];
	        //step through filename by character and append to array
	        for (int i = 0; i < filename.length(); i++) {
	            charArray[i] = filename.charAt(i);
	        }
	        //create stack
	        Stack<Character> stack = new Stack<Character>();
	 
	        for (int i = 0; i < charArray.length; i++) {
	            Character temp = new Character(charArray[i]);
	            //else if to check for matching pairs
	            if (temp.equals('{') || temp.equals('(') || temp.equals('[')) {
	                stack.push(temp);
	            } else if (temp.equals('}') || temp.equals(')') || temp.equals(']')) {
	                if (temp.equals('}') && stack.peek().equals('{')) {
	                    stack.pop();
	                } else if (temp.equals(')') && stack.peek().equals('(')) {
	                    stack.pop();
	                } else if (temp.equals(']') && stack.peek().equals('[')) {
	                    stack.pop();
	                    //if matching pair not found print:
	                } else {
	                    System.out.println("There is a mistake at index: " + i);
	                    System.out.println("\n Here's the code (the error is in the middle):\n");
	                    for (int j = i - 20; j <= i + 20; j++) {
	                        System.out.print(charArray[j]);
	                    }
	                    //for esthetics 
	                    System.out.println("\n");
	                }
	            }
	 
	        }
	        if (stack.isEmpty()) {
	            System.out.println("All grouping pairs match.");
	        } else {
	            System.out.println("You have incorrect pairs.");
	        }
	    }
	}
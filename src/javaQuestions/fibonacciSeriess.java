package javaQuestions;

public class fibonacciSeriess {
	   public static void main(String[] args) {
	        int n = 15; // Number of terms to print in the series
	        int Start = 0;
	        int Second = 1;
	        int Last;

	        System.out.println("Fibonacci series of " + n + " terms:");

	        for (int i = 1; i <= n; i++) {
	            System.out.print(Start + " ");

	            Last = Start + Second;
	            Start = Second;
	            Second = Last;
	        }
	    }
	}



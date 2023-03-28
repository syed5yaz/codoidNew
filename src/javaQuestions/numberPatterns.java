package javaQuestions;

public class numberPatterns {
	
	    public static void main(String[] args) {
	        int rows = 7;
	        System.out.print("* ");
	        for (int i = 1; i <= rows; i++) {
	        	
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            if(i<rows) {
	            System.out.print(" * ");
	        }
	        }
	        
	    }
}
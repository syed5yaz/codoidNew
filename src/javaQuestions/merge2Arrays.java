package javaQuestions;

import java.util.Arrays;


public class merge2Arrays {
	
	    public static void main(String[] args) {
	        int array1[] = {1, 2, 3, 4, 5};
	        int array2[] = {6, 7, 8, 9, 10};
	        int result[] = new int[array1.length + array2.length];
	    
	        int p=0;
	        for(int i=0; i<array1.length; i++ ) {
	        	result[p]=array1[i];
	        p++;
	        }
	        
	        
	        for(int j=0; j<array2.length; j++) {
	        	result[p]= array2[j];
	        	p++;
	        }
	        
	        for(int i:result) {
	        	System.out.println(i);
	        }
	        System.out.println("Merged :"+ Arrays.toString(result));
	        
	    }
	    
	}



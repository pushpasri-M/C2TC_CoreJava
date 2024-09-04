package com.tns.day2;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 25;

	    // if statement
	    if (number > 0) {
	        System.out.println("The number is positive.");
	    }
	    // else if statement
	    else if (number < 0) {
	        System.out.println("The number is negative.");
	    }
	    // else statement
	    else 
	    {
	        System.out.println("The number is zero.");
	    }
	    int i = 10;
	    
	    if (i == 10 || i<15) {
	        
	        if (i < 15)
	            System.out.println("i is smaller than 15");

	        if (i < 12)
	            System.out.println(
	                "i is smaller than 12 too");
	    } else{
	            System.out.println("i is greater than 15");
	    }
	    
	    if (i == 10)
	        System.out.println("i is 10");
	    else if (i == 15)
	        System.out.println("i is 15");
	    else if (i == 20)
	        System.out.println("i is 20");
	    else
	        System.out.println("i is not present");
		 //switch case
		 int num=20;
	     switch(num){
	     case 5 :  System.out.println("It is 5");
	               break;
	     case 10 : System.out.println("It is 10");
	               break;
	     case 15 : System.out.println("It is 15");
	               break;
	     case 20 : System.out.println("It is 20");
	               break;
	     default:  System.out.println("Not present");
	     }

	}

}

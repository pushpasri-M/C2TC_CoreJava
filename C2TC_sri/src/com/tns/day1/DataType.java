package com.tns.day1;

public class DataType {

	public static void main(String[] args) {
		  int value1 = 9 / 2; //integer division 
		  float value2 = 101 / 61; 
		  double value3 = 10d / 6d; 
		  float value4 = 5/2.5f; //float division 
		  System.out.println("value 1=" + value1);  
		  System.out.println("value 2=" + value2); 
		  System.out.println("value 3=" + value3); 
		  System.out.println("value 4=" + value4); 
		   
		   
		  int marker = 512; 
		  //assigning expression to variable  
		  double percentage = marker * 0.46f; 
		  System.out.println("percentage :" + 
		percentage);
		  byte byteMax = 127; 
		  byte byteMin = -128; 
		   
		  System.out.println("Min range of byte is" + 
		    byteMin+"Max range of byte is "+byteMax); 
		   
		  //short - 2 bytes 
		  short shortMax = 32767; 
		  short shortMin = -32768; 
		  System.out.println("Minshort range of byte is" + shortMin+"Maxshort range of byte is "+shortMax); 
		   
		  //int - 4bytes 
		  int maxInt = 2147483647; 
		  int minInt = -2147483648; 
		  System.out.println("Minint range of byte is" + minInt+"Maxint range of byte is "+maxInt); 
		   
		  //long - 8bytes 
		  long maxLong = 9223372036854775807L; 
		  long minLong = -9223372036854775808L; 
		   
		  System.out.println("Minlong range of byte is" + minLong+"Maxlong range of byte is "+maxLong); 
		   
		  float f=3234.141243278345f; 
		  double d=3456.14124512345678902345678914f; 
		  System.out.println("float value is "+f+" double value is "+d); 
		   
		//boolean  
		boolean flag=false; 
		System.out.println("boolean value is "+flag);
	}

}

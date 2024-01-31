package com.project;

public class reverse1 {

	
	public static void main(String[] arg) {

	

	String stringinput = "ILOVEMYINDIA";
   
	char[] resultarray = stringinput.toCharArray();
    
    for (int i = resultarray.length - 1; i >= 0; i--)
    
    //System.out.print(resultarray.length);
	System.out.print(resultarray[i]);
   

	}
}
package com.project;
//import java.util.*; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverse {
	
	public static void main(String[] args) {  
        List<String> l = new ArrayList<String>();  
        l.add("Mango");  
        l.add("Banana");  
        l.add("Mango");  
        l.add("Apple");  
        System.out.println("Before Reversing"+ "    "+ l);  
        Collections.reverse(l);  
        System.out.println("After Reversing"+ "   " + l);  
        
    }  
}  
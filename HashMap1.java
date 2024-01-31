package com.project;

import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		
        String a = "aabsccdjhjsdhsjdh";
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i = 0; i < a.length(); i++) {
        	
            if (map.containsKey(a.charAt(i))) {
                int n = map.get(a.charAt(i)) + 1;
               //System.out.println(n);
               //System.out.println(n+ " " +a.charAt(i)+ " " + map.containsKey(a.charAt(i)));
                map.put(a.charAt(i), n);
               // System.out.println(map.containsKey(a.charAt(i)));
                //System.out.println(map.get(a.charAt(i)));
               
              //System.out.println(map);
            }
            
            else {
               
            	map.put(a.charAt(i), 1);
            	
            }
        }
       System.out.println(map);
       
    }
}
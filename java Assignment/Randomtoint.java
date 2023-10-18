package Assigmment.vvv;
import java.io.*;
import java.util.*;
public class Randomtoint 
	{
	    public static void romanToInt(String s)
	    {
	        Map<Character,Integer> rti=new HashMap<>();  
	 
	         //Adding elements to map  
	        rti.put('I',1);  
	        rti.put('V',5);  
	        rti.put('X',10);  
	        rti.put('L',50);  
	        rti.put('C',100);  
	        rti.put('D',500);  
	        rti.put('M',1000);
	       
	        s = s.replace("IV","IIII");
	        s = s.replace("IX","VIIII");
	        s = s.replace("XL","XXXX");
	        s = s.replace("XC","LXXXX");
	        s = s.replace("CD","CCCC");
	        s = s.replace("CM","DCCCC");
	          
	        int number = 0;
	        for (int i = 0; i < s.length(); i++) 
	        {
	            number = number + (rti.get(s.charAt(i)));
	        }
	        System.out.println(number);
	  }
	    public static void main (String[] args) 
	    {
	        romanToInt("IX");
	        romanToInt("IXX");
	        romanToInt("X");
	    }
	}
	 

package com.murphyjohn;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Anagram{
	
	static boolean isAnagram(String a, String b) {
		
	    //Check if they are the same length. If not it will return false as they cannot be anagrams.
		if(a.length() != b.length()){
			return false;
		}
		
		//make it all the same case, so that it's not case sensitive.
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		//Convert the strings into ArrayLists of Character wrapper objects.
		ArrayList<Character> achars = new ArrayList<Character>();
		for (char c : a.toCharArray()) {
		  achars.add(c);
		}
		
		ArrayList<Character> bchars = new ArrayList<Character>();
		for (char c : b.toCharArray()) {
		  bchars.add(c);
		}
		
		//Check the amount of times each Character occurs in the string and see if they match for both.
		for(int i=0; i<achars.size();i++){
			int freq1= Collections.frequency(achars, achars.get(i)); //how many times a letter in String a appears in string a
			int freq2= Collections.frequency(bchars, achars.get(i)); //how many times a letter in String a appears in string b
			if(freq1!=freq2){
				//if each letter does not appear the exact same amount in both Strings then they are not anagrams.
				return false;
			}
			else continue;
			}
		
		return true;
	}
	
	

	public static void main(String[]args){
		 Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	
	}
}


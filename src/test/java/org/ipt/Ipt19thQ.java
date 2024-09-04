package org.ipt;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.xml.stream.events.Characters;

public class Ipt19thQ {
	
	public static void main(String[] args) {
		
		//to remove character duplicates from string; raining here...
		
		String s= "raining here...";
		
		Set<Character> s1=new  LinkedHashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			s1.add(c);
			
		}
		
		for (Character x : s1) {
			
			System.out.print(x);
			
		}
		
		
	}

}

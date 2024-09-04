package org.ipt;

public class Ipt18thQ {
	
	//to change each first letter Caps
	
	public static void main(String[] args) {
		
		String s= "welcome to java class";
		
		String[] sp = s.split(" ");
		
		String res=" ";
		
		for (String s1: sp) {
			
			char smal = s1.charAt(0);
			
			String sub = s1.substring(1);
			
			char upp = Character.toUpperCase(smal);
			
			
			res=res+upp+sub+" ";
			
		}
		
		System.out.println(res);
		System.out.println("code1");
	}

}

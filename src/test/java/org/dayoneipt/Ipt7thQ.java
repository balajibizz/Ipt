package org.dayoneipt;

public class Ipt7thQ {
	
	public static void main(String[] args) {
		
		int num=101;
		int n=num;
		
		int rem=0;
		int res=0;
		
		while (num>0) {
			
			rem=num%10; 
			
			res=(res*10)+rem;
			
			num=num/10;
			
		}
		
		if (res ==n) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}

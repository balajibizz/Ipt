package org.dayoneipt;

public class Ipt3rdQ {
	
	public static void main(String[] args) {
		
		//3.Count of odd numbers between 1 to 100
		
		int numbers =0;
		for (int i = 1; i <=100; i++) {
			
			if (i%2==1) {
				
				numbers++;
				
			}
		}
		
		System.out.println(numbers);
	}

}

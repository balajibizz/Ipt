package org.ipt;

public class Ipt37thQ {
	
	public static void main(String[] args) {
		
		int num=5;
		
		for (int i = 1; i <=num; i++) {
			
			for (int j = num; j >=i; j--) {
				
				System.out.print(" ");
				
			}
			
			for (int j = 1; j <=i; j++) {
				
				System.out.print(" *");
				
			}
			System.out.println();
		}
		
	}

}

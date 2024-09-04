package org.dayoneipt;

public class Ipt6thQ {
	public static void main(String[] args) {
		
	
	
	int num=143;
	int rem=0;
	int res=0;
	
	while (num>0) {
		
		rem=num%10;//3
		
		res=(res*10)+rem; //0=(0%10)+3 //3
		
		num=num/10; //14
		
	}
	
	System.out.println(res);
	
	
	
	
	}

}

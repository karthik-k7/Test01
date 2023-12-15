package org.sample;

public class Sample {
	
	public static void main(String[] args) {
		
		int b[] = new int[2];
		String a[] = new String[4];
		
		a[0]="Java";
		a[1]="Selenium";
		a[2]="Maven";
		a[3]="Cucumber";
		b[0]=10;
		b[1]=20;
				
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		System.out.println("**********************");
		for (String s : a) {
			System.out.println(s);
			
			}
		
		System.out.println("****************");
		
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
			
		}
		
	} 

}

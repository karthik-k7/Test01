package org.sample;

public class TwodArray {
	
	public static void main(String[] args) {
		
		int a[][] = new int[3][3];
		
		a[0][0]=100;
		a[0][1]=90;
		a[0][2]=80;
		a[1][0]=70;
		a[1][1]=60;
		a[1][2]=50;
	
		
	int length = a.length;
	System.out.println("Array Length: "+length);	
	
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				System.out.println(a[i][j]);
				
			}
			
			System.out.println("*******************");
			
			for (int[] is : a) {
				for (int j : is) {
					
					System.out.println(j);
					
				}
				
			} 
			
		}
		
		
		
	}

}

package alljavapackages;

import java.util.Scanner;

public class Swapping {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int c;
		
		
//		a = a+b;
//		b = a-b;
//		a = b+a;
		
//		b = b-a;
//		a = b+a;
		
//		c = a;
//		a = b;
//		b = c;
		
		System.out.println("Enter the values of a and b");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		b = b-a;
		a = b+a;
		
		
		
		
		System.out.println("a =" +a);
		System.out.println("b =" +b);

	}

}

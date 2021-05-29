package alljavapackages;

import java.util.ArrayList;

public class Arraylistandarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] fruits = new String[3];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Orange";
		
		System.out.println("my fav fruit is: " + fruits[0]);
		
		int [] numbers =new int[3];
		numbers[0] = 5;
		numbers[1] = 6;
		numbers[2] = 8;
		
		System.out.println("my fav number is: " + numbers[0]);
		
		
		ArrayList fruitlist = new ArrayList();
		
		
		
		fruitlist.add("apple");
		fruitlist.add("orange");
		
		fruitlist.remove("orange");
		fruitlist.add("pineapple");
		fruitlist.add("grhaps");
		
		
		
		System.out.println(fruitlist);
		
		
		

	}

}

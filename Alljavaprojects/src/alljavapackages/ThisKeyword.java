package alljavapackages;

public class ThisKeyword {
	
	static int a =10;
	static int b =20;
	
	static int c = a + b;
	
	
	
	public static void main (String [] args) {
		
		
		
		ThisKeyword t = new ThisKeyword();
		int h = t.c;
		System.out.println(h);
		
		
		System.out.println("test text");
	}
	
}

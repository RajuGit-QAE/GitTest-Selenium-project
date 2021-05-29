package alljavapackages;

public class SuperKeyword {
	
	public void display() {
		
		System.out.println("hi raja");
	}
 static int a = 10;
}
	
 class Kidclass extends SuperKeyword{
	 
	 public  void display(int a , int b) {
		 
		 int c = a+b;
		 
		 System.out.println(c);
		 System.out.println("hi daddy!");
		 	super.display();
		  	SuperKeyword s = new SuperKeyword();
			s.display();
		 
		 
	 }
	 
 }
 class Running{
    public static void main (String [] args) {
    	
    	Kidclass k = new Kidclass();
  
    	k.display(5,6);
    	
    	
		 
		 System.out.println("hey main!!!");
		 System.out.println(SuperKeyword.a);
		 
	 }
	 
}
	
	 
	 
	

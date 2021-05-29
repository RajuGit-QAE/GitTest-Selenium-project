package alljavapackages;

public class Encapsulation {
	
	private String name ;
	private int age ;
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public int calcMethod() {
		int a =10;
		int b = 20;
		int c = a+b;
		
		System.out.println(c);
		return c;
	}
}
 
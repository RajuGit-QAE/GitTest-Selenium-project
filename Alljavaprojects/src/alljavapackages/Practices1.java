package alljavapackages;

public class Practices1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation e = new Encapsulation();
		e.setAge(10);
		int res5 = e.getAge();
		System.out.println(res5);
		e.calcMethod(); 
		
		
		int res = Practices1.test("Rajaganapathi");
		System.out.println(res);
	}

	public static int test(String a){
		int count = 0;
		int len = a.length();
		for(int i=0; i<len; i++) {
			if(a.charAt(i)=='a') {
				count++;
			}
		}
		
		
		return count;
	}
}

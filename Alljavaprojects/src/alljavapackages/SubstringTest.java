package alljavapackages;

public class SubstringTest {
	
	
	

	public static boolean subTest(String s1, String s2) {
		
	return s1.contains(s2);
	
		
	}
	
	public static boolean subTest1(String s1, String s2) {
		
		
		return s1.matches("(.*)" + s2 + "(.*)");
			
		}
	
	public static boolean subTest2(String s1, String s2) {
		
		
		boolean r=  s1.indexOf(s2)!=-1;
		
		return r;
			
		}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		boolean a= subTest("Rajaganapathi" ,"Raja");
		System.out.println(a);
		
		boolean b= subTest1("Rajaganapathi" ,"sofiya");
		System.out.println(b);
		
		
		boolean c= subTest2("Rajaganapathi" ,"ramu");
		System.out.println(c);
		
	}

}

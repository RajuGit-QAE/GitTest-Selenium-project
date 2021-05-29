package alljavapackages;
 
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myTest("Rajaganapathi", 'e'));

	}
	public static String myTest(String s1, char s2) {
		
		 
//		return s1.contains(s2);
//		return s1.matches("(.*)" + s2 + "(.*)");
//		return s1.indexOf(s2)!=-1;
		return s1.replace('i', s2);
	}
}

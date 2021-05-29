package alljavapackages;

public class TestOnetoHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int one = 'a'/'a';
		System.out.println(one);
		
		String hund = "..........";
		int len = hund.length()*hund.length();
		System.out.println(len);
		
		for (int i=one; i<=len; i++) {
			System.out.println(i);
		}
		
		for (int i=one; i<='d'; i++) {
			System.out.println(i);
		}

	}

}

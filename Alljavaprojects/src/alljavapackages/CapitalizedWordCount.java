package alljavapackages;

public class CapitalizedWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "JavaIsWonderfulLanguageIHaveEverSeen!";
		int count = 0;
		for (int i = 0; i< str.length(); i++) {
			
			if(str.charAt(i) >= 65  && str.charAt(i) <= 90) {
				count++;
				
			}
			
		}
		System.out.println(count);

	}

}

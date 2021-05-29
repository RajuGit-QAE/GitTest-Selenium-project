package alljavapackages;

public class TestOne {
	
			
	public static void main(String [] args) {
		
		int [] arr = new int [] {1,2,3,3,4,5,5,6};
		
		System.out.println("duplicat elements in an array:");
		
		for(int i=0; i<=arr.length;i++) {
			for (int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) 
					System.out.println(arr[j]);
					
				
			}
			
		}
		System.out.println(arr.length);
}
	
}
package alljavapackages;

public class Practices {
	
	
	public static int newTest(int [] arr, int [] arr1, int a1) {
		
		int sum1=0;
		int sum2=0;
		
		for(int i = 1; i<= arr.length; i++) {
			int res1 = sum1 + i;
			sum1 = res1;
			
		}
		System.out.println(sum1);
		
		
		for (int j = 1; j<=arr1.length; j++) {
			int res2 = sum2 + j;
			sum2 = res2;
			
		}
		System.out.println(sum2);
		
		int finalresult = sum1 - sum2;
		
		return finalresult;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,3,4,5,6,7,8,0};
		int [] arr1 = {1,2,3,4,5,6,7,8,0};
		System.out.println(Practices.newTest(arr,arr1,10));

	}

}

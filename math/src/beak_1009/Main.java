package beak_1009;
import java.util.*;
public class Main {
	
	static int arr[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		int result [] = new int [11];
		
		for(int i=1; i<=10; i++) {
			result[i] = i;
		}
		while(testcase-- >0) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			arr = new int[b+1];
			
			int current =1;
			int result1 = a;
			for(int i=1; i<=b;i++) {
				
				result1 = current*a % 10;
				current = result1%10;
			}
			
			if(current == 0)
				System.out.println( 10);
			else
				System.out.println(current);
			
		}
		// TODO Auto-generated method stub

	}
	

}

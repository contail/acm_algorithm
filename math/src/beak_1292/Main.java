package beak_1292;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int [1000000];
		
		int count =1;
		for(int i=1; i<=1005; i++) {
			
			for(int j=1; j<=i; j++) {
				arr[count++] = i;
				
			}
			
		}
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum =0;
		for(int i =a; i<=b; i++) {
			sum+=arr[i];
		}
		
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}

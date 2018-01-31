package beak_11055;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		
		int arr[] = new int[n+1];
		int dp[] =new int [n+1];
		for(int i=1; i<=n; i++) {
			arr[i] = sc.nextInt();
		}
		
		dp[1] = arr[1];
		/*
		 * 
		 * 1 100 2 50 60 3 5 6 7 8
		 * 
		 * 
		 * 101  
		 */
		int count = 0;
		for(int i=1; i<=n; i++) {
			int max =0;
			
			for(int k=0; k<i; k++) {
				//System.out.println(arr[k]  + " ===== " + arr[i]);
				if(arr[k] <arr[i])
				{
					if(max < dp[k])
						max = dp[k];
				}
				
			}
			dp[i] = max + arr[i];
			if(count < dp[i])
				count = dp[i];
				
			
			
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}

package beak_11053;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//수열을 담을 array
		int arr [] = new int[10000];
		//길이를 담을 array
		int dp [] = new int [10000];
		
		int a = sc.nextInt();
		for(int i=1; i<=a; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		for(int i=1; i<=a; i++) {
			int min = 0;
			for(int k=0; k<i;k++) {
				if(arr[i] > arr[k]) {
					if(min<dp[k])
						min = dp[k];
				}
			}
			dp[i] = min+1;
			if(max < dp[i])
				max = dp[i];
			
		}		
		System.out.print(max);
		// TODO Auto-generated method stub

	}

}

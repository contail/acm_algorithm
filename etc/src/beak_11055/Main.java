package beak_11055;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int arr[] = new int [2000];
		int dp []= new int [2000];
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1; i<=a; i++) {
			arr[i] = sc.nextInt();
		}
		dp[1] = arr[1];
		//1 100 2 50 60 3 5 6 7 8
		int max = 0;
		for(int i=1; i<=a; i++) {
			dp[i] = arr[i];
			for(int k=0; k<i; k++) {
				
				if(arr[k] < arr[i] && dp[i] < dp[k] + arr[i]) { // 오른쪽이 더 큰경우이면, 
					dp[i] = dp[k] + arr[i];
				}
			}
			if (max < dp[i])
				max = dp[i];
		}
		System.out.print(max);
		// TODO Auto-generated method stub

	}

}

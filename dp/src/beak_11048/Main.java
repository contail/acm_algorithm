package beak_11048;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n+1][m+1];
		int dp[][] = new int[n+1][m+1];
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=m; k++) {
				arr[i][k] = sc.nextInt();
			}
		}
		dp[1][1] = arr[1][1];
		
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=m; k++) {
				dp[i][k] = Math.max(dp[i-1][k-1] +arr[i][k], Math.max(dp[i][k-1]+arr[i][k], dp[i-1][k]+arr[i][k]));
			}
		}
		
		System.out.println(dp[n][m]);
		// TODO Auto-generated method stub
		

	}

}

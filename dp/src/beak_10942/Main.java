package beak_10942;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n =sc .nextInt();
		int arr [] =new int [n+1];
		int dp [][] =new int [n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i] =sc.nextInt();
		}
		
		for(int i=1; i<=n;i++) {
			dp[i][i] =1;
		}
		
		for(int i=1; i<=n-1; i++) {
			if(arr[i] == arr[i+1])
				dp[i][i+1] =1;
		}
		
		
		for(int i=3; i<=n ; i++) {
			for(int k=1; k<=n-i+1; k++) {
				int j =   i+k-1;
				if(arr[k] == arr[j] && dp[k+1][j-1]==1)
					dp[k][j] = 1;
			}
		}
		int m =sc.nextInt();
		
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b= sc.nextInt();
			
			System.out.println(dp[a][b]);
			
		}
		// TODO Auto-generated method stub

	}

}

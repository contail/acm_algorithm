package beak_1965;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n+1];
		int dp[] = new int [n+1];
		
		for(int i=1; i <=n; i++) {
			arr[i]= sc.nextInt();
		}
		
		dp[1]=1;
		int  max=1;
		for(int i=1; i<=n; i++) {
			dp[i]=1;
			
			for(int k=1; k<i; k++) {
				if(arr[k] < arr[i] && dp[i] < dp[k] +1)
					dp[i] = dp[k] + 1;
				if(max < dp[i])
					max = dp[i];
			}
		}
		System.out.println(max);
		
		
		// TODO Auto-generated method stub

	}

}

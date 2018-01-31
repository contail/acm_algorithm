package beak_14501;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dp[] = new int [n+1];
		
		int arr[] = new int[n+1];
		int pay[] = new int[n+1];
		for(int i=1; i<=n; i++) {
		
			arr[i]=sc.nextInt();
			pay[i] = sc.nextInt();
			dp[i] = pay[i];
		}
		int max =0;
		for(int i=2; i<=n; i++) {
			
			for(int k=1; k<i; k++) {
				if(i-k>=arr[k]) {
					dp[i] = Math.max(dp[k]+pay[i], dp[i]);
		
				}
					
			}
		}
		
		for(int i=1; i<=n;i++) {
			if(i+arr[i]<=n+1)
				if(max<dp[i])
					max=dp[i];
		}
		
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}

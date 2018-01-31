package beak_11052;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fish = sc.nextInt();
		int dp[] = new int [fish+1];
		int pay [] = new int [fish+1];
		
		for(int i=1 ;i<=fish; i++) {
			pay[i] = sc.nextInt();
			dp[i] = pay[i];
		}
		int max = 0;
		for(int i=2; i<=fish ; i++) {
			int temp = i-1;
			for(int k=1; k<i; k++) {
				
				dp[i] = Math.max(dp[k]+pay[temp], dp[i]);
			
				temp = temp - 1;
				if(max < dp[i])
					max=dp[i];
			}
		}
		if(fish ==1) {
			System.out.println(dp[1]);
		}
		else
			System.out.println(max);
		
		// TODO Auto-generated method stub

	}

}

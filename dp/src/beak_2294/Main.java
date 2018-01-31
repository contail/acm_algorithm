package beak_2294;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int [d+1];
		int max =0;
		for(int i=1; i<=d; i++) {
			int a =sc.nextInt();
			arr[i] = a;
			if (max < arr[i])
				max =arr[i];		
		}
	
		int a=0;
		if (max > k)
			a= max;
		else
			a =k;
	
		int dong[] = new int[a+1];
		int dp [] = new int [a+1];
		for(int i=1; i<=k; i++) {
			dp[i] = 987654321;
			dong[i] = 98765321;
		}
		for(int i=1; i<=d; i++) {

				dong[arr[i]] =1;
				dp[arr[i]]=1;		
		}
		dp[1] = dong[1];		
		if(d>=2) {
			for(int i=2; i<=k; i++) {			
				for(int z=1; z<i; z++) {				
					dp[i] = Math.min(dp[i-z] + dong[z], dp[i]);				
				}					
			}		
			if(dp[k] >10000) {
				System.out.println(-1);
			}
			else
				System.out.println(dp[k]);
		}
		else
		{
			if(arr[1] ==k)
				System.out.println(1);
			else
				System.out.println(-1);
		}
		// TODO Auto-generated method stub

	}

}

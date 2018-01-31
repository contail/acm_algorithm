package beak_11727;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dp[] = new int[n+1];
		dp[1]= 1;
		if(n>1)
			dp[2] =3;
		for(int i=3; i<=n; i++) {
			dp[i] = (dp[i-2]*2 + dp[i-1]) %10007;
		}
		
		System.out.println(dp[n]);
	}

}

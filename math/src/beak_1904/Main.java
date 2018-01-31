package beak_1904;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		// n=1 =>1
		// n =2 =>2
		// n=3 => 100, 001, 111 3	개
		// n=4 => 1100, 1001, 0011, 1111, 0000 =>5
		// n=5 => 10000, 11100, 11111, 00100, 00001, 11001, 10011, 11001, 
		// TODO Auto-generated method stub
		
		int dp[] = new int [1000000];
		dp[1] =1;
		dp[2] =2;
		dp[3] =3;
		dp[4] =5;
		
		for(int i=3; i<=a; i++) {
			dp[i] = dp[i-1] + dp[i-2];
			dp[i] %=15746;
		}
		
		System.out.println(dp[a]);

	}

}

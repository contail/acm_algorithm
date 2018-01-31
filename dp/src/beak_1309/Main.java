package beak_1309;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int dp[] = new int [2*a+1];
		
		dp[0] = 1;
		dp[1] =3;
		
		for(int i=2; i<=a; i++) {
			dp[i] = (dp[i-2] + dp[i-1] *2)%9901;
		}
		
		System.out.println(dp[a]);
		
		//a =1 일때 3
		//a=2 일떄 우리크기는 4,  3
		//a = 3 일때 우리의 크기 6, 
		// TODO Auto-generated method stub

	}

}

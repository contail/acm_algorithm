package beak_10872;
import java.util.*;

public class Main {
	static int dp[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		dp = new int[10000];
		
		System.out.println(fac(n));
		// TODO Auto-generated method stub

	}
	
	public static int fac(int n) {

		if(n<=1)
			return 1;
		else {
			return n * fac(n-1);
		}
	}
	
		
	

}

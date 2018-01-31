package beak_2010;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		int sum=0;
		for(int i=0; i<n; i++) {
			int a= sc.nextInt();
			sum+=a;
		}
		
		System.out.println(sum-n+1);
		// TODO Auto-generated method stub

	}

}

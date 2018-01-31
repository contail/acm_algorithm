package beak_10707;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int result1 =a *e;
		int result2=0;
		if(e<=c)
			result2 = b;
		else
			result2 = b+(e-c)*d;
		
		System.out.println(Math.min(result1, result2));

	}

}

package beak_12790;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase=sc.nextInt();
		
		for(int i=0; i<testcase; i++) {

			int sum =0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int a1 = sc.nextInt();
			int b1 = sc.nextInt();
			int c1 = sc.nextInt();
			int d1 = sc.nextInt();
			
			if(a+a1<=1)
				sum+=1;
			else {
				sum = a+a1;
			}
			
			if(b+b1 <=1)
				sum = sum+5;
			else {
				sum = sum + (b+b1)*5;
			}
			
			
			if(c+c1 <0)
				sum+=0;
			else {
				sum = sum + (c1+c)*2;
			}
			
			sum = sum+ (d1+d)*2;
			System.out.println(sum);
			
		}
		// TODO Auto-generated method stub

	}

}



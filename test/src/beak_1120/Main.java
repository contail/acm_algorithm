package beak_1120;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  a= sc.next();
		String b = sc.next();
		
		int count[] = {987654321};
		
		for(int i=0; i<=b.length()-a.length(); i++) {
			int count1=0;
			for(int k=0; k<a.length(); k++) {
				if(a.charAt(k)!= b.charAt(i+k))
					count1++;
				
			}
			if(count[0]>count1)
				count[0] = count1;
		}
		
		System.out.println(count[0]);
		
		
//		int count =0;
//		for(int i=0; i<a.length();i++) {
//			if(a.charAt(i) != b.charAt(i))
//				count++;
//		}
//		
//		int count2 =0;
//		int a_count=0;
//		for(int i= b.length()-a.length(); i<b.length();i++) {
//			System.out.println(b.charAt(i));
//			if(a.charAt(a_count) != b.charAt(i))
//				count2++;
//			a_count++;
//		}
//		
//		System.out.println(Math.min(count, count2));
		
		
		// TODO Auto-generated method stub

	}

}

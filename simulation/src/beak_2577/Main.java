package beak_2577;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = a*b*c;
		String str = Integer.toString(d);
		
		for(int i=0; i<10; i++) {
			int count =0;
			for(int k=0; k<str.length();k++) {
				if(Integer.parseInt(str.charAt(k)+"")==i)
					count++;
			
			}
			System.out.println(count);
		}
		// TODO Auto-generated method stub

	}

}

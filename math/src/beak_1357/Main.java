package beak_1357;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		String a1 = Integer.toString(a);
		String a2 = Integer.toString(b);
		
		StringBuffer sb = new StringBuffer(a1);
		sb.reverse();
		a = Integer.parseInt(sb.toString());
		StringBuffer sb1 = new StringBuffer(a2);
		sb1.reverse();
		b = Integer.parseInt(sb1.toString());
		int result = a+b;
		
		StringBuffer re = new StringBuffer(Integer.toString(result));
		System.out.println(Integer.parseInt(re.reverse().toString()));
		
		// TODO Auto-generated method stub
		
		

	}

}

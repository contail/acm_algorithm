package beak_2864;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c =a;
		int d = b;
		
		String a1 = Integer.toString(a);
		String b1 = Integer.toString(b);
		String c1 = Integer.toString(c);
		String d1 = Integer.toString(d);
		
		String a2="";
		String b2="";
		String c2="";
		String d2="";
		for(int i=0; i<a1.length();i++) {
			if(a1.charAt(i) == '6')
				a2+="5";
			else
				a2+=a1.charAt(i);
		}
		for(int i=0; i<b1.length();i++) {
			if(b1.charAt(i) == '6')
				b2+="5";
			else
				b2+=b1.charAt(i);
		}
		for(int i=0; i<c1.length();i++) {
			if(c1.charAt(i) == '5')
				c2+="6";
			else
				c2+=c1.charAt(i);
		}
		
		for(int i=0; i<d1.length();i++) {
			if(d1.charAt(i) == '5')
				d2+="6";
			else
				d2+=d1.charAt(i);
		}
		// TODO Auto-generated method stub
		
		a = Integer.parseInt(a2);
		b = Integer.parseInt(b2);
		c = Integer.parseInt(c2);
		d = Integer.parseInt(d2);
		
		System.out.print(a+b + " ");
		System.out.println(c+d);

	}

}

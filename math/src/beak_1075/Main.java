package beak_1075;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = sc.nextInt();
		
		String c = "";
		for(int k=0; k<a.length()-2; k++) {
			c +=a.charAt(k)+"";
		}
		c+="0";
		c+="0";
		int d = Integer.parseInt(c);
		while(true) {
			if(d%b ==0)
				break;
			else
				d++;
		}
		c = Integer.toString(d);
		System.out.print(c.charAt(c.length()-2));
		System.out.println(c.charAt(c.length()-1));
	}
}

package beak_14490;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s[] = str.split(":");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);		
		int result = 1;		
		if(a>=b) {	
			for(int i =1; i<=b; i++) {
				if(a%i == 0 && b%i == 0) {
					result = i;
				}					
			}	
		}
		else {
			for(int i =1; i<=a; i++) {
				if(a%i == 0 && b%i == 0)
					result = i;
			}
		}	
		System.out.println(a/result+ ":"+b/result);
	}

}

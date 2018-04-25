package beak_6588;
import java.util.*;
public class Main {
	
	static int a[];
	static int b[];
	static boolean[] memo= new boolean[1000001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		settings();
		while(true) {
			 a  =new int[1];
			 b = new int[1];
			int input = sc.nextInt();		
			
			if(input == 0)
				break;
			check(input);
			int result = a[0] + b[0];
			if(result <3) {
				System.out.println("Goldbach's conjecture is wrong.");
			}else
				System.out.println(result +" = " +a[0]+  " + " + b[0]);
			
		}

	}
	
	public static void settings() {
		
		for(int i=3; i<=1000000; i = i+2) {
			is_check(i);
		}
		
	}
	
	public static void check(int gold) {
		
		for(int i=3; i<=gold; i= i+2) {
			
			if(!memo[i]) {
				if(!memo[gold-i]) {
					a[0] = i;
					b[0] = gold-i;
					break;
				}
				else {
					continue;
				}
			}
			else
				continue;
			
		}
		
	}
	
	public static boolean is_check(int n) {
		
		
		
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i ==0) {
				memo[n] = true;
				return true;
			}
				
		}
		
		return false;
	}

}

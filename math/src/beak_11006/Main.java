package beak_11006;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int testcase =sc.nextInt();		
		while(testcase-- > 0) {
			int a = sc.nextInt(); //닭다리 갯수 
			int b = sc.nextInt(); // 닭의 갯수 
			System.out.println( b*2 -a+ " " + (b-( b*2 -a)));
		}
	}

}

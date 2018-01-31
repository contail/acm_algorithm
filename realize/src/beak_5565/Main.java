package beak_5565;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
		int sum=0;
		for(int i=0; i<9;i++) {		
			sum += sc.nextInt();
		}	
		System.out.println(a-sum);
		// TODO Auto-generated method stub

	}

}

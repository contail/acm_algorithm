package beak_5543;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min = 9999;
		int min1 = 9999;
		for(int i=0; i<3;i++) {
			int a = sc.nextInt();
			min = a < min ? a : min;
		}
		
		for(int i=0; i<2; i++) {
			int a = sc.nextInt();
			min1  = a < min1 ? a : min1;
		}
		System.out.println(min+min1-50);
		// TODO Auto-generated method stub

	}

}

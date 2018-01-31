package beak_1085;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int min1 = Math.min(x-0, w-x);
		int min2 = Math.min(y-0, h-y);
		System.out.println(Math.min(min1, min2));
		// TODO Auto-generated method stub

	}

}

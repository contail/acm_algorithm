package beak_2753;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a % 400 ==0 || ( a%4 ==0 && a%100 !=0)) {
			System.out.println(1);
		}
		else
			System.out.println(0);
		// TODO Auto-generated method stub

	}

}
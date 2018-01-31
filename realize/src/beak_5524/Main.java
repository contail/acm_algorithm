package beak_5524;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String arr[] = new String[a];
		for(int i=0; i<a; i++) {
			arr[i] = sc.next().toLowerCase();
		}
		
		for(int i=0; i<a; i++)
			System.out.println(arr[i]);
		// TODO Auto-generated method stub

	}

}

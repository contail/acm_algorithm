package beak_10817;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		
		 
		 int arr[] = new int[3];
		 
		 for(int i=0; i<3; i++) {
			 arr[i]= sc.nextInt();
		 }
		 Arrays.sort(arr);
		 System.out.println(arr[1]);
		// TODO Auto-generated method stub

	}

}

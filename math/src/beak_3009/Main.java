package beak_3009;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[3][2];
		for(int i=0; i<3; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		int x = arr[0][0];
		int y = arr[0][1];
		boolean check_x  = false;
		boolean check_y = false;
		int result_x = 0;
		int result_y = 0;
		for(int i =1; i<3; i++) {
			if(arr[i][0] ==x) {
				check_x = true;
				result_x = arr[3-i][0];
			}
			
			if(arr[i][1] == y) {
				check_y = true;
				result_y = arr[3-i][1];
			}
		}
		
		if(!check_x) {
			System.out.print(x + " ");
		}
		else {
			System.out.print(result_x + " ");
		}
		if(!check_y) {
			System.out.print(y + " ");
		}
		else {
			System.out.print(result_y + " ");
		}
		

	}

}

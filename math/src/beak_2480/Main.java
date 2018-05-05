package beak_2480;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int arr[] = new int[3];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		
		if(arr[0] == arr[1]  && arr[1] ==arr[2] && arr[0] == arr[2]) {
			System.out.println(10000+arr[1]*1000 );
		}
		else if (arr[0] == arr[1]) {
			System.out.println(1000+arr[1]*100 );
		}
		else if (arr[0] == arr[2]) {
			System.out.println(1000+arr[0]*100 );
		}
		else if (arr[1] == arr[2]) {
			System.out.println(1000+arr[1]*100 );
		}
		else {
			int max = 0;
			for(int i=0; i<3; i++) {
				if(max < arr[i])
					max = arr[i];
			}
			System.out.println(100*max);
		}
		// TODO Auto-generated method stub

	}

}

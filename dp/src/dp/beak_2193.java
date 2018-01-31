package dp;
import java.util.*;
public class beak_2193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		long arr[] = new long[input+1];
		arr[0] = 0;
		arr[1] =1;
		
		for(int i=2; i<=input; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		System.out.println(arr[input]);
	

	}

}

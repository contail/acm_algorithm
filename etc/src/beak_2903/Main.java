package beak_2903;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 , 2 , 3, 4, 
		// 3*3,
		// n =1 일때 면은 2
		//n = 2일  면은 전에꺼 곱하기 *2
		//n = 3일때 면은 전에꺼 곱하기 *2
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		long arr [] = new long [16];
		arr[0] = 1;
		for(int i=1; i<=15; i++) {
			arr[i] = arr[i-1]*2;
		}	 
		System.out.print((long) Math.pow(arr[b]+1,2));
		 
	}

}

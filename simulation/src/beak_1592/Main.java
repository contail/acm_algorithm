package beak_1592;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		int l  = sc.nextInt();
		
		int arr[] = new int [n];
		
		int count =0;
		int test=0;
		while(true) {
			int check=l;
		//	System.out.println((count+1) + " ====count ===");
			if(arr[count] == m-1)
				break;
			arr[count]++;
		//	System.out.println(arr[count] + "======???=====");
			if(arr[count] %2!=0) {
				for(int i=0; i<l; i++) {
					if(count+1 < n)
						count++;
					else
						count=0;
				}
			}
			else {
				for(int i=0; i<l; i++) {
					if(count-1 >= 0)
						count--;
					else
						count=n-1;
				}
			}
			test++;
			
			
		}
		System.out.println(test);
	}

}

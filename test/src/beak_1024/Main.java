package beak_1024;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long value  = sc.nextInt();
		int find = sc.nextInt();
		long arr[] = null ;
		
		long x;
		int result =0;
		while(true) {
			x = (value-((find-1)*find / 2))%find;
			if(find > 100 ) {
				result =1;
				break;
			}
				
				
			if(x==0) {
				arr = new long[find];
				x = (value-((find-1)*find / 2))/find;
				if(x<0) {
					result =1;
					break;
				}
				for(int i=0; i<find; i++) {
					arr[i] = x;
					x++;
				}
				break;
			}
				
			else {
				find++;
			}
				
		}
		
		if(result == 1) {
			System.out.println(-1);
		}
		else {
			for(int i=0; i<find; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		
		
		
	}

}

/*

18 2

5 6 7

19 2

9 10

19 3

 1 2 3 

*/
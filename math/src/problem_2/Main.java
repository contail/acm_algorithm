package problem_2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int [N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}	
		int max=0;
		for(int i=0; i<arr.length-1;i++) {
			int count=1;
			int diff = arr[i+1]-arr[0];
			int temp = arr[0];
			for(int k=0; k<arr.length-1;k++) {
				if(diff+temp == arr[k+1]) {
					temp = arr[k+1];
					count++;
					if(count ==M) {
						max = diff;
						if(max<diff)
							max = diff;
					}		
				}			
			}
		}
		System.out.println(max);
		
	}

}

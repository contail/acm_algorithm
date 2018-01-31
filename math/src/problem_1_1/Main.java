package problem_1_1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N= sc.nextInt();
		int count=0;
		int nanum=1;
		int arr[]= new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			
		}
		Arrays.sort(arr);
		int min = arr[0];
		System.out.println(min+ "min");
		int max =0;
	
			
			
			for(int i=1; i<=min; i++) {
				count =0;
				for(int k=0; k<N; k++) {
					count += arr[k] /i;
				}
				if (count == M) {
					System.out.println(i +" count ");
					if(max < i)
						max = i;
				}
			}
			
			
//			
//			for(int i=0; i<N;i++) {
//				count += arr[i] / nanum;
//				System.out.println(count + "===count====   : "  +  i + " " + nanum + " arr[i] " + arr[i]  + " ====> " + arr[i]/nanum);
//				if(count >M)
//					break;
//			}
//			if(count ==M || nanum>M || nanum==25)
//				break;
//			else
//				nanum+=1;
//			System.out.println(nanum+ " ==nanum===  ");
		
	System.out.println(max);
	


	}

}

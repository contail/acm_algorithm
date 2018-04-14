package beak_2863;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double arr[] = new double [4];
		
		int max_cir=0;
		double max_sum = 0;
		double sum = 0;
		for(int i=0; i<4; i++)
			arr[i] =sc.nextInt();
		
		sum = arr[0] / arr[2] + arr[1]/ arr[3];
		if(sum > max_sum) {
			max_cir=0;
			max_sum = sum;
		}
	 
			
		
		sum = arr[2] / arr[3] + arr[0]/ arr[1];
		if(sum > max_sum) {
			max_sum = sum;
			max_cir=1;
		}
		 
		sum = arr[3] / arr[1] + arr[2]/ arr[0];
		if(sum > max_sum) {
			max_sum = sum;
			max_cir=2;
		}
			
	 
		sum = arr[1] / arr[0] + arr[3]/ arr[2];
		if(sum > max_sum) {
			max_sum = sum;
			max_cir=3;
		}
		
		 
			
		
		System.out.println(max_cir);
	}

}

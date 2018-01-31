package beak_1110;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		if(a <10)
			a = a*10;
		
		int temp =a;
		int arr[] = new int[1];
		
		
		int count =0;
		int new_number=0;
		while(true) {
			arr[0] = a%10;
		
			a = (a/10 + a%10);
			new_number = arr[0] * 10 + a%10;
			
			a = new_number;
			count++;
			if(new_number ==temp)
				break;
			
			
			
			
			
			
		}
		System.out.println(count);
		// TODO Auto-generated method stub
		
	}

}

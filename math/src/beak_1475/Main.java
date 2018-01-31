package beak_1475;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a= sc.next();
		
		int b = a.length();
		int arr[] = new int[10];
		for(int i=0; i<b; i++)
		{
			arr[Integer.parseInt(a.charAt(i)+"")]++;
		}
		
		int sum = arr[9] +arr[6];
		if(sum % 2==0) {
			arr[9]  = sum/2;
			arr[6] =sum/2;
		}
		else if(sum !=0){
			arr[9] = sum/2 +1;
			arr[6] = sum/2 +1;
		}
		
		int max = 0;
		
		for(int i=0; i<10; i++) {
			max = max < arr[i] ? arr[i] : max;
			
		}
			
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}

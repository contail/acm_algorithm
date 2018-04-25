package beak_9506;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		// TODO Auto-generated method stub
		
		while(true) {
			int num = sc.nextInt();
			if(num == -1)
				break;
			
			int temp =1;
			int arr[] = new int[num];
			arr[0] = 1;
			for(int i=2; i<=num/2; i++) {
				
				if(num%i ==0)
				{
					arr[temp++] = i;
				}
			}
			
			int result =0;
			for(int i=0; i<temp; i++) {
				result +=arr[i];
			}
			
			if(result == num) {
				System.out.print(num +" = " );
				for(int i=0; i<temp-1; i++) {
					System.out.print(arr[i] + " + ");
				}
				System.out.println(arr[temp-1]);
			}
			else {
				System.out.println(num + " is NOT perfect.");
			}
		}

	}

}

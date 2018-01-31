package beak_2979;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int final_value =0;
		int arr[] = new int[101];
		for(int i=0; i<3; i++) {
			
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			if(a2 > final_value)
				final_value = a2;
			
			for(int k=a1; k<a2; k++) {
				arr[k]++;
			}
			
		}
		int sum =0;
		for(int j=0;j<100;j++){
		    if(arr[j]==1)sum+=1*a;
		    if(arr[j]==2)sum+=2*b;
		    if(arr[j]==3)sum+=3*c;

		}
		
		System.out.println(sum);
	}

}

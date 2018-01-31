package beak_5585;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =1000-sc.nextInt();
		
		int count =0;
		
		
		while(true) {
			if(n==0) {
				break;
			}
			if(n>=500) {
				n-=500;
				count++;
			}
			else if(n>=100) {
				n-=100;
				count++;
			}
			else if (n>=50) {
				n-=50;
				count++;
			}
			else if(n>=10){
				n-=10;
				count++;
			}
			else if(n>=5) {
				n-=5;
				count++;
			}
			else {
				n-=1;
				count++;
			}
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}

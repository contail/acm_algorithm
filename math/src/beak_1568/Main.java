package beak_1568;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int time =0;
		int count =1;
		
		while(true) {
			
			
				a = a-count;
				time++;
				

				if(++count > a) {
					count =1;
				}
				
				if(a==0)
					break;
			

		}
		
		System.out.println(time);
		// TODO Auto-generated method stub
		
		//14
		// 1-> 13
		// 2 -> 11
		// 3->8
		// 4->4
		// 1 ->3
		// 2 ->1
		// 1->0

	}

}

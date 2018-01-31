package beak_1173;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int init_heart = sc.nextInt();
		int min = init_heart;
		int max = sc.nextInt();
		int add = sc.nextInt();
		int minus = sc.nextInt();
		int count =0;
		boolean check = false;
		if(init_heart + add > max) {
			System.out.println(-1);
		}
		else {
			while(true) {
				if (time <=0)
					break;
				
				if(init_heart + add <=max) {
					count++;
					time--;
					init_heart +=add;
				}
				else {
					int temp = init_heart -=minus;
					if(temp <min)
						init_heart = min;
					else
						init_heart = temp;
					count++;
				}
					
			}
			System.out.println(count);
		}
		
		// TODO Auto-generated method stub

	}

}

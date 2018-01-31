package beak_10253;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		while(testcase-- >0) {
			int up = sc.nextInt();
			int bottom = sc.nextInt();
			int first_check = 2;
			
			while(true) {
				if (up == 1) {
					System.out.println(bottom);
					break;
				}
				if(1*bottom <=up*first_check) {
					up = up*first_check - bottom;
					bottom = bottom * first_check;
					if(bottom % up ==0) {
						System.out.println(bottom/up);
						break;
					}
				}
				else
					first_check++;
			}
		}

	}

}

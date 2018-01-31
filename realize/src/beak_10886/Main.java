package beak_10886;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
		int count1 =0;
		for(int i=0; i<n; i++) {
			if(sc.nextInt() == 0) {
				count1+=1;
			}
			else {
				count+=1;
			}
		}
		if(count > count1) {
			System.out.println("Junhee is cute!");
		}
		else {
			System.out.println("Junhee is not cute!");
		}
		// TODO Auto-generated method stub

	}

}

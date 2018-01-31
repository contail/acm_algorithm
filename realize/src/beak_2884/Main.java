package beak_2884;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		int result = 0;
		if(min - 45 <=0) {
			int temp = 45 - min;
			min = 60;
			result = min - temp;
			hour-=1;
			if(hour<0)
				hour = 23;
		}
		else {
			result = min - 45;
		}
		String a = "";
		if(result<10) {
			a = "0" + Integer.toString(result);
		}
		else {
			a = Integer.toString(result);
		}
		
		System.out.println(hour + " " + result );
		
		
		
		
		// TODO Auto-generated method stub

	}

}

package beak_2909;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next(); int k=sc.nextInt();
		int count = (int) (Integer.parseInt(c));
		int result = 0;
		if(Math.pow(10, k) > count) {
			
			count /= Math.pow(10, k);
			if(( (int) (count+1) * Math.pow(10, k)) - 5*Math.pow(10,k-1) > Integer.parseInt(c)) {
			
				result = (int) (count * Math.pow(10, k));
			}
			else {
				result = (int) ((count+1) * Math.pow(10, k));
			}
			
		
			System.out.println(result);
		}
		
		else {
			
			count /= Math.pow(10, k);
			if(( (int) (count+1) * Math.pow(10, k)) - 5*Math.pow(10,k-1) > Integer.parseInt(c)) {
			
				result = (int) (count * Math.pow(10, k));
			}
			else {
				result = (int) ((count+1) * Math.pow(10, k));
			}
			
		
			System.out.println(result);
		}
		
		
		// TODO Auto-generated method stub

	}

}

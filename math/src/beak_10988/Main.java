package beak_10988;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		boolean check = false;
		for(int i=0; i<a.length()/2; i++) {
			if(a.charAt(i) !=a.charAt(a.length()-1-i)) {
				check = true;
				System.out.println(0);
				break;
				
			}
		}
		if(!check)
			System.out.println(1);
		// TODO Auto-generated method stub

	}

}

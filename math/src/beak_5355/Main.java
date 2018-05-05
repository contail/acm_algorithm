package beak_5355;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int i =0; i<testcase; i++ ) {
			float a= sc.nextFloat();
			String b = sc.nextLine();
			String token [] = b.trim().split(" ");
			
			for(int k=0; k<token.length;k++) {
				if(token[k].equals("@")) {
					a *=3;
				}
				else if (token[k].equals("#")) {
					a-=7;
				}
				else {
					a+=5;
				}
				
				
			}
			String result = String.format("%.2f", a);
			System.out.println(result);
		}
		
		

	}

}

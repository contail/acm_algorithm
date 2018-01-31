package beak_10798;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		String arr[][] =new String[15][15];
		
		
		
		for(int i=0; i<5; i++) {
			String a = sc.next();
			
			for(int k=0; k<a.length(); k++) {
				arr[i][k] = a.charAt(k)+"";
			}
		}
		
		String result ="";
		
		for(int i=0; i<15; i++) {
			for(int k=0; k<5; k++) {
				if(arr[k][i]==null) {
					continue;
				}
				else {
					result+=arr[k][i];
				}
			}
		}
		
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}

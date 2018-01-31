package beak_1620;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		HashMap <Integer, String> map = new HashMap<>();
		HashMap <String, Integer> map1 = new HashMap<>();
		
		for(int i=1; i<=a; i++) {
			String a1 = sc.next();
			map.put(i, a1);
			map1.put(a1, i);
		}
		
		for(int i=1; i<=b; i++) {
			String a1 = sc.next();
			
			if(a1.charAt(0)-'0' >=0 && a1.charAt(0)-'0' <=9) {
				System.out.println(map.get(Integer.parseInt(a1)));
			}
			else {
				System.out.println(map1.get(a1));
			}
		}
		
	}
	
	 

}

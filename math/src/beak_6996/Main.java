package beak_6996;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int testcase = sc.nextInt();
		while(testcase-- >0) {
			ArrayList <String> a1 = new ArrayList();
			ArrayList <String> a2 = new ArrayList();
			
			String a = sc.next();
			String b = sc.next();
			for(int i=0; i<b.length();i++) {
				a2.add(b.charAt(i)+"");
			}
			for(int i=0; i<a.length();i++) {
				if((a2.indexOf(a.charAt(i)+"") != -1)){
					a2.remove(a2.get(a2.indexOf(a.charAt(i)+"")));
				}
				
			}
			
			if(a2.size()==0 && a.length() == b.length())
				System.out.println(a + " & " + b + " are anagrams.");
			else
				System.out.println(a + " & " + b + " are NOT anagrams.");
			
			
		}
	}

}

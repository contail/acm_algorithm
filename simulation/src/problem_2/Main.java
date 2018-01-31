package problem_2;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase=sc.nextInt();
		String abc[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		List <String> ls = new ArrayList<String>(Arrays.asList(abc));
		
		
		for(int i=0; i<testcase;i++) {
			String a = sc.next();
			String arr[] = new String[a.length()];
			
			for(int z=0 ;z<a.length();z++) {
				arr[z] = a.charAt(z)+"";
			}
			
			int count = a.length()/2;
			
			int check_count =0;
			
			for(int k=0; k<count;k++) {
				
				while(true) {
					if(ls.indexOf(arr[k]) >ls.indexOf(arr[a.length()-k-1])) {
						check_count++;
						int index = ls.indexOf(arr[k])-1;
						arr[k] = ls.get(index)+"";
						
						
					}
					else if (ls.indexOf(arr[k]) <ls.indexOf(arr[a.length()-k-1])){
						
						check_count++;
						int index = ls.indexOf(arr[a.length()-k-1])-1;
						arr[a.length()-k-1] = ls.get(index)+"";
					}
					else if(arr[k].equals(arr[a.length()-k-1]))
						break;
					
					
				}
			}
			
			System.out.println(check_count );
		}
		// TODO Auto-generated method stub

	}

}

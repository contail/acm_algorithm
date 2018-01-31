package pro1;

import java.util.*;

public class Main {
	static int n;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		n = sc.nextInt();
		
		String words[]=new String [n];
		int aws []= new int[n];
		for (int k = 0; k < n; k++) {
			ArrayList <String> al = new ArrayList();
			
			words[k] = sc.next().toLowerCase();
			String abc [] =new String[words[k].length()];
			int total_count = 0;
			for(int i=0; i<words[k].length();i++) {
				
				abc[i] =words[k].charAt(i)+"";
			}
			for(int i=0; i<words[k].length()-1;i++) {
				if(abc[i].equals(abc[i+1])) {	
					abc[i+1] ="#";
					total_count++;
				}
			}
			
			aws[k] = total_count;
			

		}
		System.out.println(Arrays.toString(aws));
	}

}

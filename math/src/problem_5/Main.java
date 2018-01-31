package problem_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		List <String> ls = new ArrayList<String>(Arrays.asList(abc));
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<String> input = new ArrayList<String>();
		ArrayList<String> input1 = input;
		for(int i=0; i<num;i++) {
			input.add(abc[i]);
		}
		
		int count = sc.nextInt();
		for(int i = 0; i<count;i++) {
			String a =sc.next();
			String b = sc.next();
			
			if(input.indexOf(a) < input.indexOf(b))
				continue;
			else {
				int temp = input.indexOf(a);
				
				int temp1 = input.indexOf(b);
			
				
				input.remove(temp1);
				input.add(temp,b);
			
			}
				//System.out.println(input + "==========");
		}
		
		for(int i=0; i<input.size();i++) {
			System.out.print(input.get(i));
		}
	}

}

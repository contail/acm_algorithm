package beak_1547;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int arr[]= new int[testcase];
		arr[0]=1;
		int current_position=1;
		int start =0;
		while(testcase-- >0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if((x !=current_position && y!=current_position)) {
				continue;
				
			}
			else if(x==current_position || y!=current_position) {
				current_position = y;
				
			}
			else if(x!=current_position || y==current_position){
				current_position = x;
			}
			
			
		}
		System.out.println(current_position);
		// TODO Auto-generated method stub

	}

	

}

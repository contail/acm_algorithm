package beak_1526;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [10000000];
		int a = sc.nextInt();
		int index =0;
		for(int i=4; i<=a; i++) {
			int count =0;
			//System.out.println(Integer.toString(i).length()+ " == = " + i );
			for(int k=0; k<Integer.toString(i).length(); k++) {
				
				if(Integer.toString(i).charAt(k) =='4') {
					count++;
				}else if(Integer.toString(i).charAt(k) =='7') {
					count++;
				}
			}
			if (count == Integer.toString(i).length()) {
				arr[index] = i;
				index++;
			}
				
			
		}
	
		System.out.println(arr[index-1]);
		
	}
	
	

}

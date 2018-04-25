package beak_11653;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int i=2;
		int temp=1;
		int check = num;
		while(true) {
			
			if (temp == check)
				break;
			if(num %i ==0) {
				System.out.println(i);
				num /=i;
				i=2;
			}
			else
				i++;
			temp++;
			
		}
		
		 
		// TODO Auto-generated method stub

	}

}

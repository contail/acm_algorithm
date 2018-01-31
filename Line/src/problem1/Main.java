package problem1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		/*
		 * 시간 복잡도 n - 반복문1개 
		 * 공간 복잡도 1 -
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =n;
		float sum = 0;
		int check=0;
		for(int i=0; i<n;i++) {
			
			sum +=sc.nextInt();
		}
		while(true) {
			if(sum/(count) >=9.5) {
				break;
			}
			else {
				count++;
				check++;
				sum+=10;
			}
		}
		
		System.out.println(check);
		
		
		// TODO Auto-generated method stub

	}

}

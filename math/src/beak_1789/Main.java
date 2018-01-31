package beak_1789;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		long count =1;
		long sum =1;
		long n = sc.nextLong();
		while(true) {
			n -=sum;
			if(n <=sum)
				break;
			else {				
				count++;
				sum++;
			}			
		}		
		System.out.println(count);
		// TODO Auto-generated method stub
		
	}

}

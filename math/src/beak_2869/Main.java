package beak_2869;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		// TODO Auto-generated method stub
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int count =0;
	
		
		while(true) {
			
			c-=a;
			count++;
			if(c<=0)
				break;
			c+=b;
			
			
		}
		
		System.out.println(count);
		
		

	}

}


/*

4  -2  4  -2  4

2 1 5


*/
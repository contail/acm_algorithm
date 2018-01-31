package beck_1057;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new  Scanner(System.in);
		int round = sc.nextInt();
		int kim = sc.nextInt();
		int lim = sc.nextInt();		
		int count =0;
		while(kim!=lim) {
			
			kim = kim/2 + kim%2;
			lim = lim/2 + lim%2;
			count +=1;
			
		}
		
		System.out.println(count);
		
		
		
		
		

	}

}


/*

16 8 9
8/2 =4
4/2 =2
2/2 =1

10/5

1,2 3,4 5,6 7,8 9,10 11,12 13,14 15,16

1,3 5,8 9,11 13,15

1,8  9,13

8,9


*/
package beak_1952;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean check[][] = new boolean[m + 1][n + 1];
		int x = 0;
		int y = 0;
		int count = 0;
		int result = 0;
		boolean checking = false;
		 check[x][y]=true;

		while (true) {
			if(m ==0 && n==0)
				break;
			
			for (int i = 0; i < n-1; i++) {
				
				if(check[x][y+1] == true && check[x+1][y] ==true)
				{
					
					return;
				}
				else {
					check[x][y]=true;
					y++;
				}
			}
			if(check[x][y] == true) {
				 y= y-1;
			}
			n = n-1;
			
			
			result++;
			System.out.println(x + " === " + y+ "===gd==");
			for (int i = 0; i < m-1; i++) {
				if(check[x+1][y] ==true)
				{
					
					return;
				}
				else {
					check[x][y]=true;
					x++;
				}
			}
			if(check[x][y] == true) {
				x = x-1;
			}
			
			m= m-1;
			
			result++;
			System.out.println(x + " === " + y+ "===gd==");
			
			
			for (int i = n; i > 0; i--) {
				if(check[x][y-1] == true && check[x+10][y] ==true)
				{
					
					return;
				}
				else {
					check[x][y]=true;
					y--;
				}
			}
			if(check[x][y] == true) {
				y = y+1;
			}
			
			n= n-1;
			result++;
			System.out.println( x + "===" + y+   " " + m + " ");
			
			for (int i = m; i >0 ; i--) {
				if(check[x-1][y] == true && check[x][y+1] ==true)
				{
					
					return;
				}
				else {
					check[x][y]=true;
					x--;
				}
				
			}
			System.out.println(x + "xx;");
			if(check[x][y] == true) {
				x = x+1;
			}
			
			
			m= m-1;
			System.out.println( x + "===" + y+   " " + m + " ");
			int a =1;
		
			

		}

		System.out.println(result);
		// TODO Auto-generated method stub

	}

}

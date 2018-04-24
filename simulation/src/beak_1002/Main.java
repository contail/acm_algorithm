package beak_1002;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase-- > 0) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 =sc.nextInt();
			int r2 = sc.nextInt();
			
			int m_d = (r1-r2) * (r1-r2);
			int p_d = (r1+r2) * (r1+r2);
			
			int d =  (x2-x1)* (x2-x1) + (y2-y1)*(y2-y1);
		 
			if(x1 == x2 && y1 == y2) {
				if(r1 == r2)
					System.out.println(-1);
				else
					System.out.println(0);
			}
			else {
				if (m_d < d && d <p_d )
					System.out.println(2);
				else if ( d == p_d || (d == m_d && d!=0))
					System.out.println(1);
				else if ( d < m_d || d > p_d)
					System.out.println(0);
				else
					System.out.println(-1);
			}
				
			
		}

	}

}
// 4, 8   3
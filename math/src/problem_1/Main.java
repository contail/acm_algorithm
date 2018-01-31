package problem_1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int d = sc.nextInt();
		int part = sc.nextInt();
		int value = s+d-part;
		int count =0;
		for(int i=1; i<=value; i++) {
			int dari = value-i;
			int sawon=i;			
			if(sawon/2 <=dari && sawon <=s && dari<=d)  {		
				if(count<sawon/2) {
					count = sawon/2;
				}
			}	
		}	
		System.out.println(count);

	}

}

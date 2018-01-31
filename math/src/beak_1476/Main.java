package beak_1476;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int n1= sc.nextInt();
		int n2 = sc.nextInt();
		int total=1;
		
		int start=1;
		int start1=1;
		int start2=1;
		
		while(true) {
			if(start ==n && start1 ==n1 && start2 ==n2)
				break;
			total+=1;
			start +=1;
			if(start >15)
				start=1;
			start1+=1;
			if(start1>28)
				start1=1;			
			start2+=1;
			if(start2 >19)
				start2=1;		
		}
		
		System.out.println(total);
		// TODO Auto-generated method stub

	}

}

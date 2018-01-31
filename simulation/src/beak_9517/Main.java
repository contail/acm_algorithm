package beak_9517;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start_people = sc.nextInt();
		int question_count = sc.nextInt();
		int start_time = 0;
		int aws = 1;
		for(int i=0; i<question_count; i++) {
			int time = sc.nextInt();
			String a = sc.next();
			
			start_time += time;
			
			if(start_time >=210) {
				aws = start_people;
				break;
			}
				
			
			if(a.equals("T")) {
				if(start_people==8) {
					start_people=1;
				}
				else
					start_people++;
			}
			
			
		}
		System.out.println(aws);
		

	}

}

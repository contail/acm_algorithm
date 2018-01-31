package beak_1021;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int queue_size = sc.nextInt();
		int indexes = sc.nextInt();
		int arr[] = new int[indexes];
		
		for(int i=0; i<queue_size;i++) {
			
			al.add(i+1);
			
		}
		int total_count =0;
		for(int i=0; i<indexes; i++) {
			
			int find_value = sc.nextInt();
			if(al.get(0) == find_value) {
				al.remove(0);
				continue;
			}
			else {
				while(true) {
					if(al.indexOf(find_value)  <= (al.size()-1)/2) {
						
						int temp = al.get(0);
						al.remove(0);
						al.add(temp);
						total_count++;
					}
					else {
						int temp = al.get(al.size()-1);
						al.remove(al.size()-1);
						al.add(0,temp);
						total_count ++;
						
					}
					
				
					if(al.get(0) == find_value) {
						al.remove(0);
						break;
					}
				}
			}
			
		}
		
//		int count =0;
//		int total_count = 0;
//		Arrays.sort(arr);
//		
//		while(!al.isEmpty()) {
//			
//				
//			
//			
//			if(arr[count] == al.get(0)) {
//				al.remove(0);
//				count ++;
//			}			
//			else if(al.size()>1) {
//				int find_index = al.indexOf(arr[count]);
//				if(find_index < al.size()/2) {
//					int temp = al.get(0);
//					al.remove(0);
//					al.add(temp);
//					total_count++;
//				}
//				else {
//					int temp = al.get(al.size()-1);
//					al.remove(al.size()-1);
//					al.add(0,temp);
//					total_count++;
//				}
//			}
//			else {
//				int temp = al.get(0);
//				al.remove(0);
//				al.add(temp);
//				total_count++;
//			}
//			
//		}
//		
		
		System.out.println(total_count);
		
		

	}

}

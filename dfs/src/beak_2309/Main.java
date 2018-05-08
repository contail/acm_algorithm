package beak_2309;
import java.util.*;
public class Main {
	
	static int arr[];
	static int total;
	static boolean check;
	static ArrayList<Integer> al = new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		arr = new int [10];
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		
		dfs(0,0,0);
		
	}
	
	public static void dfs(int start, int index, int sum) {
		
		if(start == 7) {
			if(sum==100) {
				Collections.sort(al);
				for(int i=0; i<al.size();i++) {
					System.out.println(al.get(i));
				}
				check = true;
				return;
			}
				
		}
		
		for(int i= index; i<9; i++) {
			if(check)
				break;
			sum  += arr[i];
			al.add(arr[i]);
			dfs(start+1, index+1, sum);
			sum -=arr[i];
			al.remove(al.size()-1);
		}
	}

}

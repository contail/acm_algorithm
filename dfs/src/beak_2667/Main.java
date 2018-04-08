package beak_2667;
import java.util.*;
public class Main {

	static int arr[][];
	static boolean check[][];
	static int index;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static int count=0;
	static int total_count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		index =sc.nextInt();
		check = new boolean[index+1][index+1];
		arr = new int[index+1][index+1];
		
		for(int i=1; i<=index; i++) {
			String a = sc.next();
			for(int k=1; k<=index; k++)
				arr[i][k] = Integer.parseInt(a.charAt(k-1)+"");
		}
		
		ArrayList<Integer> al = new ArrayList();
		for(int i=1; i<=index; i++) {
			for(int k=1; k<=index; k++) {
				if(arr[i][k] ==1 && !check[i][k]) {
					count =0;
					dfs(i,k);
					al.add(count);
					total_count+=1;
				}
					
					
			}
		}
		
		dfs(1,1);
		
		Collections.sort(al);
		System.out.println(total_count);
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
	
	public static void dfs(int x, int y) {
		check[x][y] = true;
		if(arr[x][y] !=0)
			count++;
		for(int i=0; i<4; i++) {
			int next_x = dx[i] + x;
			int next_y = dy[i] + y;
				if(next_x >=1 && next_y >=1 && next_x <=index && next_y <=index &&!check[next_x][next_y] && arr[next_x][next_y]==1) {				
					dfs(next_x,next_y);
				}
		}
		
	}

}

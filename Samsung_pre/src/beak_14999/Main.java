package beak_14999;
import java.util.*;
public class Main {
	 static final int East =1;
	 static final int West = 2;
	 static final int North = 3;
	 static final int South = 4;
	 
	 static int dx[] = {0, 0,-1,1};
	 static int dy [] = {1,-1,0,0 }; //동서북남   
	 static int dice_pos[][] = new int [5][5];
	 
	 static Queue<Node> dir = new LinkedList<Node>();
	 static Queue<Node> dice = new LinkedList<Node>();
	 static int map [][];
	 static int n,m;
	static class Node{
		int x, y;
		
		Node(int x){
			this.x = x;
		}
		Node(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	static public void solve() {
		
		while(!dir.isEmpty()) {
			
		
			int current_x = dice.peek().x;
			int current_y = dice.peek().y;
			dice.remove();			
			int next_move = dir.peek().x;
			dir.remove();
			int next_x = current_x + dx[next_move-1];
			int next_y = current_y + dy[next_move-1];		
			if(next_x >=0 && next_y >=0 && next_x<n && next_y <m) {
				
				int value = map[next_x][next_y];
				if(next_move ==East) {
					int temp = dice_pos[2][3];
					dice_pos[2][3] = dice_pos[2][2];
					dice_pos[2][2] = dice_pos[2][1];
					dice_pos[2][1] = dice_pos[4][2];
					if(value ==0) {
						map[next_x][next_y] = temp;
						dice_pos[4][2] = temp;
					}
					else {
						map[next_x][next_y] = 0;
						dice_pos[4][2] = value;
					}
					
					
					
				}
				else if(next_move == West) {
					int temp = dice_pos[2][1];
					dice_pos[2][1] = dice_pos[2][2];
					dice_pos[2][2]  = dice_pos[2][3];
					dice_pos[2][3] = dice_pos[4][2];
					dice_pos[4][2] = value;
					if(value ==0) {
						map[next_x][next_y] = temp;
						dice_pos[4][2] = temp;
					}
					else {
						map[next_x][next_y] = 0;
						dice_pos[4][2] = value;
					}
					
				}else if(next_move == North) {
					
					int temp = dice_pos[1][2];
				
					
					dice_pos[1][2] = dice_pos[2][2];
					dice_pos[2][2] = dice_pos[3][2];
					dice_pos[3][2] = dice_pos[4][2];
					dice_pos[4][2] = value;
					if(value ==0) {
						map[next_x][next_y] = temp;
						dice_pos[4][2] = temp;
					}
					else {
						map[next_x][next_y] = 0;
						dice_pos[4][2] = value;
					}
					
					
					
				}else if (next_move == South) {
					
					int temp = dice_pos[3][2];
				
					dice_pos[3][2] = dice_pos[2][2];
					dice_pos[2][2] = dice_pos[1][2];
					dice_pos[1][2] = dice_pos[4][2];
					dice_pos[4][2] = value;
					
					if(value ==0) {
						dice_pos[4][2] = temp;
						map[next_x][next_y] = temp;
					}
					else {
						
					
						map[next_x][next_y] = 0;
						dice_pos[4][2] = value;
					}
					
				}
				System.out.println(dice_pos[2][2]);
				dice.add(new Node(next_x,next_y));
			}
			else {
				dice.add(new Node(current_x,current_y));
				}		
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		m = sc.nextInt();
		int init_x = sc.nextInt();
		int init_y = sc.nextInt();
		
		dice.add(new Node(init_x,init_y));
		
		int  k = sc.nextInt();
		
		map = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] =sc.nextInt();
			}
		}
		
		for(int i=0; i<k; i++) {
			dir.add(new Node(sc.nextInt()));
		}
		
		
		solve();
		
		
		// TODO Auto-generated method stub

	}

}


/*

0 2
3 4
5 6
7 8
4 4 4 1 3 3 3 2

0 0 3 

1 2 3 4 5 6

dice[][]

     0
    000
     0
     3
     
     3
    000
     0
     5
     
     5
    030
     0
     7
     
     5
    031
     0
     7
     
     
     

*/

package beak_1063;
import java.util.*;
public class Main {
	static Queue<Node> queqe = new LinkedList<Node>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String map[][] = {{"A8","B8","C8","D8","E8","F8","G8","H8"},
				{"A7","B7","C7","D7","E7","F7","G7","H7"},
				{"A6","B6","C6","D6","E6","F6","G6","H6"},
				{"A5","B5","C5","D5","E5","F5","G5","H5"},
				{"A4","B4","C4","D4","E4","F4","G4","H4"},
				{"A3","B3","C3","D3","E3","F3","G3","H3"},
				{"A2","B2","C2","D2","E2","F2","G2","H2"},
				{"A1","B1","C1","D1","E1","F1","G1","H1"}};
		
		int king_map [] = new int [2];
		int stone_map [] = new int [2];
		String king = sc.next();
		for(int i=0; i<8;i++) {
			for(int k=0; k<8;k++) {
				if(king.equals(map[i][k])) {
					king_map[0] = i;
					king_map[1] = k;
					
				}
			}
		}
		String stone = sc.next();
		for(int i=0; i<8;i++) {
			for(int k=0; k<8;k++) {
				if(stone.equals(map[i][k])) {
					stone_map[0] = i;
					stone_map[1] = k;
					
				}
			}
		}
		
		int testcase = sc.nextInt();
		
		while(testcase-- >0) {
			/*
			 * R : 한 칸 오른쪽으로
				L : 한 칸 왼쪽으로
				B : 한 칸 아래로
				T : 한 칸 위로
				RT : 오른쪽 위 대각선으로
				LT : 왼쪽 위 대각선으로
				RB : 오른쪽 아래 대각선으로
				LB : 왼쪽 아래 대각선으로
			 */
			String go = sc.next();
			if(go.equals("R")) {
				if(king_map[0] >=0 && king_map[1]+1 >=0 && king_map[0] <8 && king_map[1]+1<8) {
					king_map[1] +=1;
					if(king_map[0] == stone_map[0] && king_map[1]== stone_map[1]) {
						stone_map[1]+=1;
						if(stone_map[1] >7 || stone_map[1]<0)
						{
							stone_map[1]-=1;
							king_map[1] -=1;
						}
					}
				}
				else
					continue;
				
			}else if(go.equals("L")) {
				if(king_map[0] >=0 && king_map[1]-1 >=0 && king_map[0]<8 && king_map[1]-1<8) {
					king_map[1] -=1;
					if(king_map[0] == stone_map[0] && king_map[1]== stone_map[1]) {
						stone_map[1]-=1;
						if(stone_map[1] >7 || stone_map[1]<0)
						{
							stone_map[1]+=1;
							king_map[1] +=1;
							
						}
					}
				}
				else
					continue;
			}
			else if(go.equals("T")) {
				if(king_map[0]-1 >=0 && king_map[1] >=0 && king_map[0]-1 <8 && king_map[1]<8) {
					king_map[0] -=1;
					
					if(king_map[0] == stone_map[0] && king_map[1]== stone_map[1]) {
						stone_map[0]-=1;
						if(stone_map[0] >7 || stone_map[0]<0)
						{
							stone_map[0]+=1;
							king_map[0] +=1;
						}
						
					}
				}
				else
					continue;
			}
			else if(go.equals("B")) {
				if(king_map[0]+1 >=0 && king_map[1] >=0 && king_map[0]+1 <8 && king_map[1]<8) {
					king_map[0] +=1;
					if(king_map[0] == stone_map[0] && king_map[1]== stone_map[1]) {
						stone_map[0]+=1;
						if(stone_map[0] >7 || stone_map[0]<0)
						{
							stone_map[0]-=1;
							king_map[0] -=1;
						}
					}
				}
				else
					continue;
			}
			else if(go.equals("RT")) {
				if(king_map[0]-1 >=0 && king_map[1]+1 >=0 && king_map[0]-1 <8 && king_map[1]+1<8) {
					king_map[0] -=1;
					king_map[1] +=1;
					if(king_map[0] == stone_map[0] && king_map[1]== stone_map[1]) {
						stone_map[0]-=1;
						stone_map[1]+=1;
						if(stone_map[1] >7 || stone_map[1]<0 || stone_map[0]<0 || stone_map[0] >7)
						{
							stone_map[0]+=1;
							king_map[0] +=1;
							stone_map[1]-=1;
							king_map[1] -=1;
						}
					}
				}
				else
					continue;
				
			}
			else if(go.equals("LT")) {
				if(king_map[0]-1 >=0 && king_map[1]-1 >=0 && king_map[0]-1 <8 && king_map[1]-1<8) {
					king_map[0] -=1;
					king_map[1] -=1;
					if(king_map[0] == stone_map[0] && king_map[1]== stone_map[1]) {
						stone_map[0]-=1;
						stone_map[1]-=1;
						if(stone_map[1] >8 || stone_map[1]<0 || stone_map[0]<0 || stone_map[0] >8)
						{
							stone_map[0]+=1;
							king_map[0] +=1;
							stone_map[1]+=1;
							king_map[1] +=1;
						}
					}
				}
				else
					continue;
				
			}
			else if(go.equals("RB")) {
				if(king_map[0]+1 >=0 && king_map[1]+1 >=0 && king_map[0]+1 <8 && king_map[1]+1<8) {
					king_map[0] +=1;
					king_map[1] +=1;
					if(king_map[0] == stone_map[0] && king_map[1]== stone_map[1]) {
						stone_map[0]+=1;
						stone_map[1]+=1;
						if(stone_map[1] >7 || stone_map[1]<0 || stone_map[0]<0 || stone_map[0] >7)
						{
							stone_map[0]-=1;
							king_map[0] -=1;
							stone_map[1]-=1;
							king_map[1] -=1;
						}
					}
				}
				else
					continue;
				
			}else if(go.equals("LB")) {
				if(king_map[0]+1 >=0 && king_map[1]-1 >=0 && king_map[0]+1 <8 && king_map[1]-1<8) {
					king_map[0] +=1;
					king_map[1] -=1;
					if(king_map[0] == stone_map[0] && king_map[1]== stone_map[1]) {
						stone_map[0]+=1;
						stone_map[1]-=1;
						if(stone_map[1] >7 || stone_map[1]<0 || stone_map[0]<0 || stone_map[0] >7)
						{
							stone_map[0]-=1;
							king_map[0] -=1;
							stone_map[1]+=1;
							king_map[1] +=1;
						}
					}
				}
				else
					continue;
			}
			
			
			
		}
		System.out.println(map[king_map[0]][king_map[1]]);
		System.out.println(map[stone_map[0]][stone_map[1]]);
		
		// TODO Auto-generated method stub

	}
	
	static class Node{
		int x,y;
		Node(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

}

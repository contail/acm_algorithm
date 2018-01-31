package beak_3190;
import java.util.*;

public class Main {

	static class Node{
		int x,y;
		String dir;
	

		
		Node(int x, String dir){
			this.x = x;
			this.dir = dir;
		}
		
		Node(int x, int y){
			this.x= x;
			this.y = y;
		}
		
		
	}
	
	static Queue<Node> queue = new LinkedList<Node>();

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		
		
		int K = sc.nextInt();
		
		ArrayList<Node> apple = new ArrayList();
		for(int i=0; i<K; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			apple.add(new Node(x,y));
		}
		
		int rotations = sc.nextInt();
		// 뱀 길이 시작점
		int current_x=1, current_y=1;
		// 뱀  길이 끝점
		int end_x=1, end_y=1;
		
//		ArrayList<Node> al = new ArrayList();
//		al.add(new Node(current_x, current_y, end_x, end_y));
		
		int time = 0;
		int current_dir = 2;
		int eat_apple=0;
		int move_dir [][] = {{0,-1},{-1,0},{0,1},{1,0}};  //위, 왼쪽, 오른쪽,아래 방 
		//오른쪽의 오른쪽 ->아래
		// 아래의 오른쪽 -> 왼쪽
		// 왼쪽의 오른쪽 -> 
		String last_dir="D";
		ArrayList<Node> bam = new ArrayList();
		ArrayList<Node> info = new ArrayList();
		bam.add(new Node(current_x, current_y));
		boolean check = false;
		
		for(int i=0; i<rotations; i++) {
			info.add(new Node(sc.nextInt(), sc.next()));
		}
		
		for(int i=0; i<rotations; i++) {
			int move = info.get(0).x;
			String dir = info.get(0).dir;
			info.remove(0);
			int current_time = time;		
			for(int z=0; z<move-current_time; z++) {
				current_x = current_x +move_dir[current_dir][0];
				current_y = current_y +move_dir[current_dir][1];
				time++;
				
				//이동한 값이 경계선 밖인 경우 
				if(current_x<1 || current_y <1 || current_x >N || current_y >N) {
					check =true;
					break;
				}
				
				bam.add(new Node(current_x,current_y));
				
				//자기 몸에 부딪힌 경우 
				for(int k=0; k<bam.size()-1; k++) {
					int x = bam.get(k).x;
					int y = bam.get(k).y;
					
					if(x == current_x && y ==current_y) {
						
					//	System.out.println( "===dddd====");
						check =true;
						break;
					}
				}
				
				
				//머리 체크
				//꼬리 체크
				//뱀의 길이 갱신
				
				
				
				for(int k=0; k<apple.size();k++) {
					int x = apple.get(k).x;
					int y = apple.get(k).y;
					if(current_x ==x && current_y==y ) {				
						apple.remove(k);
						eat_apple++;
						break;
					}			
				}
				
				
				while(true) {
				
					if(bam.size() == eat_apple+1)
						break;
				
					bam.remove(0);
				}
				
				//사과 한개 먹은 경우 뱀의 길이는 2 (노드가 2개 유지)
				// 사과 두개 먹은 경우 뱀의 길이는 3 (노드가 3개 유지)
				//사과 안먹은 경우 뱀의 길이는 1 (꼬리 = 머리)
			
				
				if(check ==true)
					break;
				
			}
			
			
		
			if(check ==true)
				break;
			
			if (dir.equals("D")) {
				current_dir = (current_dir+1) %4;
			}
			//왼쪽 방향  
			else {
				current_dir = (current_dir +3)%4;
			}
		
			

		//충돌이 안될경우 현재 방향에서 전진하기 
		

		
		while(!check) {
			
			current_x = current_x +move_dir[current_dir][0];
			current_y = current_y +move_dir[current_dir][1];
		
			time++;
			
			//이동한 값이 경계선 밖인 경우 
			if(current_x<1 || current_y <1 || current_x >N || current_y >N) {
				check =true;
				break;
			}
			
			bam.add(new Node(current_x,current_y));
			
			//자기 몸에 부딪힌 경우 
			for(int k=0; k<bam.size()-1; k++) {
				int x = bam.get(k).x;
				int y = bam.get(k).y;
				
				if(x == current_x && y ==current_y) {
					check =true;
					break;
				}
			}
		}
		
		
//		System.out.println(check);
		
//		
//		for(int i=0; i<bam.size(); i++) {
//			System.out.println(bam.get(i).x + "===x==" );
//			System.out.println(bam.get(i).y  + " ==y==");
//		}
//		
//		System.out.println(bam.size());
		
		
		System.out.println(time);
		
		// TODO Auto-generated method stub

	}

	}
	}

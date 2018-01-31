package beak_10875;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	
	static final int Left  =0;
	static final int UP = 1;
	static final int Right = 2;
	static final int Down = 3;
	
	static final int Horizon = 0;
	static final int Vertical = 1;
	
	static final int Rotation_Left =-1;
	static final int Roatation_Right =1;
	
	static int dx[] = {0,-1,0,1};
	static int dy[] = {-1,0,1,0};
	
	static class Line{
		int c_start_x, c_start_y, c_end_x, c_end_y;
		int ori_x, ori_y;
	   

	    public Line(int x, int y, int x1, int y1) {
	    		
	    		this.ori_x = x1;
	    		this.ori_y = x1;
	      
	        
	        if(x >=x1) {
	        		this.c_end_x = x1;
	        		this.c_start_x = x1;
	        }
	        else {
	        		this.c_start_x = x1;
	        		this.c_end_x = x1;
	        }
	        
	        if(y >=y1) {
	        	this.c_end_y = y;
	        	this.c_start_y = y1;
	        }
	        else {
	        	this.c_start_y = y;
	        	this.c_end_y = y1;
	        }
	        
	        

	      
	    }
	    
	    public int collsion(Line prev_line) {
	    		int time=0;
	    		
	    		// 세로 선분 길이 비교하기  
	    		if(this.c_start_x == this.c_end_x) {
	    			
	    		}
	    		
	    		else {
	    			if(prev_line.c_end_y == prev_line.c_start_y) {
	    				
	    				if(this.c_start_x <= prev_line.c_start_x && prev_line.c_end_x <=this.c_end_x && prev_line.c_start_y <=this.c_start_y && this.c_start_y<=prev_line.c_end_y){
	    					
	    					
	    				}
	    			}
	    		}
	    		
	    		
	    		return 0;
	    }

	  


	
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int l = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int size = 2*l+1;
		
		int current_x = 0;
		int current_y =0;
		int current_dir = 0;
		
		//경계선 만들기 
		ArrayList<Line> al = new ArrayList();
		al.add(new Line(-l-1,-l-1,l+1,-l-1)); //바닥
		al.add(new Line(-l-1,-l-1,-l-1,l+1)); //왼쪽 
		al.add(new Line(-l-1,l+1,l+1,l+1 )); //위  
		al.add(new Line(l+1,-l-1,l+1,l+1));//오른쪽
		int select_dir[][] = {{1,0},{0,1},{-1,0},{0,-1}}; //오른, 위, 왼, 아래;
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		int time = 0;
		for(int i=0; i<n; i++) {
			
			int a = sc.nextInt();
			String b = sc.next();
			
			int new_x = current_x + a*select_dir[current_dir][0];
			int new_y = current_y + a*select_dir[current_dir][1];
			
			//우선적으로 선분 생성하기 
			Line nline = new Line(current_x,current_y,new_x,new_y);
			
			int min_time = 987654321;
			
			//충돌 체크하는 로직 
			for(int j=0; j<al.size();j++) {
				Line prev_line = al.get(i); // 이전선분들 체크하기 
				int collsions_time = nline.collsion(prev_line);
				if(collsions_time !=0) {
					min_time = Math.min(min_time, collsions_time);
					check = true;
				}
		
				}
			
			if(check ==true) {
				time += min_time;
				break;
			}
			
			
			time += a; // 충돌 안한 시간만큼 길이 더하기
			al.add(nline);
			
			if(b.equals("R")) {
				current_dir -=1;
				if(current_dir<0) {
					current_dir =3;
				}
			}
			else if(b.equals("L")) {
				current_dir +=1;
				if(current_dir ==4) {
					current_dir = 0;
				}
			}
		}
		
		
		if(check == false) {
			int new_x = current_x, new_y=current_y;
			
			//경계 선분 추가하기 
			if(current_dir ==0)//오른쪽
			{
				new_x = l+1;
			}
			//위 방향 
			else if(current_dir ==1) {
				new_y = l+1;
			}
			//왼쪽 
			else if (current_dir ==2) {
				new_x= -l-1;
			}
			//바닥 
			else if(current_dir==3) {
				new_y = -l-1;
			}
			
			Line nline = new Line(current_x, current_y,new_x,new_y);
			int min_time = 987654321;
			
			for(int i=0; i<al.size(); i++) {
				
				Line prev_line = al.get(i);
				int collsions_time = nline.collsion(prev_line);
				
				if(collsions_time !=0) {
					min_time = Math.min(min_time, collsions_time);
					
				}
			}
			
			time += min_time;
			
		}
		
		System.out.println(time);

		// TODO Auto-generated method stub

	}

}

package problem_10;
import java.util.*;
public class Main {
	 static int[][] map = new int[50][50];   // 로봇이 청소할 지
	    static int count=1; //청소하는 칸의 수 (처음엔 무조건 청소했음)
	    static int dx[] = {-1,0,1,0};   //행 이동을 위한 배열   //북, 동, 남, 서
	    static int dy[] = {0,1,0,-1};   //열 이동을 위한 배열
	    static int N,M; // 입력 값 n* 행
	     
	    static void dfs(int current_x, int current_y, int d){
	        int current_d=d;   //현재 방향 임시저장;
	         
	        for(int i=0;i<4;i++){    //총 4방향으로 이동할 수 있으므로 4번 돌림
	        		d=(d+3)%4;    //방향을 바꾸기 위한 식  // 북,서,남,동(0,3,2,1) 순서로 변경
	            int next_x =current_x+dx[d];   
	            int next_y =current_y+dy[d];    // 머리를 둔 방향으로 한칸 이동
	          
	            //current_x, current_y가 1보다 작으면 벽 => 외각이 벽
	            if(next_x>N || next_x<1 || next_y>M || next_y<1 || map[next_x][next_y]==1)  //
	                continue;   
	            
	            if(map[next_x][next_y]==0){ //청소 안한 칸이면
	                count++;    
	                map[next_x][next_y]=2;  //청소 
	                dfs(next_x,next_y,d);  
	                return;
	            }
	        }
	        //4방향의 칸 중 방문할 칸이 없으면
	        int next_d=(d+2)%4;     // 후진을 위한 방향 설정
	        // 후진
	        int next_x= current_x+dx[next_d];   
	        int next_y= current_y+dy[next_d];
	        if(map[next_x][next_y]==1)  //후진한 곳이 벽이면 리턴
	            return;
	        else    //아니면
	            dfs(next_x,next_y,current_d);   //현재 위치와 기존의 방향으로 dfs함수 호출
	    }
	    public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        int d,x,y;
	         N=sc.nextInt();
	         M=sc.nextInt();
	          
	         x=sc.nextInt();
	         y=sc.nextInt();
	         d=sc.nextInt();
	          
	         for(int i=0;i<N;i++)    //배열 입력받음
	         {
	             for(int j=0;j<M;j++)
	             {
	                 map[i][j]=sc.nextInt();
	             }
	         }
	         map[x][y]=2;   //처음 위치는 먼저 청소하므로 청소했다고 표시
	         
	         for(int i=0;i<N;i++)    //배열 입력받음
	         {
	             for(int j=0;j<M;j++)
	             {
	                 System.out.print(map[i][j]+ " ");
	             }
	             System.out.println();
	         }
	        dfs(x,y,d);
	        System.out.println(count);


	    }

}

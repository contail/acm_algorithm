package beak_12100;
import java.util.*;
public class Main {
	
	static int n;
//	static int map[][];
	static int result_max=0;
	
	static int temp[][];
	static int check_count =0;
	static int max =0;

	
	public static int find_max(int max, int map[][]) {
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(max <map[i][j])
					max = map[i][j];
			}
		}
		return max;
	}
	
	public static void init_arr(int map[][], ArrayList<Integer> al) {
		int temp1=0;
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n; k++) {
				
				map[i][k] = al.get(temp1);
				
				temp1+=1;
			}
		}
	}
	
	public static void dfs(int map[][], int step) {
		
		//System.out.println(step + "---steop===");
	
	if (step ==5)
		{
			max = find_max(max, map);
			
			return;
		
		}
		for(int i=0; i<4; i++) {
			int[][] mapCopy = new int[n+1][n+1];
			for (int j = 1; j <= n; j++) {

				//System.out.println(map[j][j] + "==map");
				mapCopy[j] = Arrays.copyOf(map[j], n+1);
			}
		
			dfs(search(mapCopy,i), step+1);
		}
	}
	
	public static int[][]  search(int map[][], int x) {
		//4가지 방향으로 해서 제일 큰 값 리턴 해주기 		
		//우선 오른쪽 방향 부터 맨 뒤부터 searching하기 
		
		boolean check = false;
		
		
		
		
		int checking =0;
		int max =0;
		switch (x) {
		case 0:
			for(int i=1; i<=n; i++) {
				int find = 0;
				for(int j=n-1 ; j>=1 ; j--) {
					
					if(map[i][j] == 0) {
						find+=1;
						continue;
					}
					
					//System.out.println(map[1][4]);
						
					if(map[i][j+find+1] == map[i][j])
					{
						map[i][j+find+1] += map[i][j];
						map[i][j] =0;
						
					}

				}
				int count_t = 21;
				while(count_t>0) {
					for(int j=n; j>=2; j--) {
						
						if(map[i][j]==0) {
							map[i][j] = map[i][j-1];
							map[i][j-1]=0;
						}
					}
					count_t--;
				}
			
			}
	//		max = find_max(max, map);
		
			
			
			break;
		case 1:
			for(int i=1; i<=n; i++) {
				int find = 0;
				for(int j=2 ; j<=n ; j++) {
					
					if(map[i][j] == 0) {
						find+=1;
						continue;
					}
						
					if(map[i][j-1 -find] == map[i][j])
					{
						map[i][j-1-find] += map[i][j];
						map[i][j] =0;
						
					}

				}
				int count_t = 21;
				while(count_t>0) {
					for(int j=1; j<=n-1; j++) {
						
						if(map[i][j]==0) {
							map[i][j] = map[i][j+1];
							map[i][j+1]=0;
						}
					}
					count_t--;
				}
			
			}	
	//		max = find_max(max, map);
			break;
		case 2 :
			for(int i=1; i<=n; i++) {
				int find = 0;
				for(int j=2 ; j<=n ; j++) {
					
					if(map[j][i] == 0) {
						find+=1;
						continue;
					}
						
					if(map[j-1-find][i] == map[j][i])
					{
						map[j-1-find][i] += map[j][i];
						map[j][i] =0;
						
					}

				}
				int count_t = 21;
				while(count_t>0) {
					for(int j=1; j<=n-1; j++) {
						
						if(map[j][i]==0) {
							map[j][i] = map[j+1][i];
							map[j+1][i]=0;
						}
					}
					count_t--;
				}
			
			}
			max = find_max(max, map);
			break;
		case 3 :
			for(int i=1; i<=n; i++) {
				int find = 0;
				for(int j=n-1 ; j>=1 ; j--) {
					
					if(map[j][i] == 0) {
						find+=1;
						continue;
					}
						
					if(map[j+1+find][i] == map[j][i])
					{
						map[j+1+find][i] += map[j][i];
						map[j][i] =0;
						
					}

				}
				int count_t = 21;
				while(count_t>0) {
					for(int j=n; j>=2; j--) {
						
						if(map[j][i]==0) {
							map[j][i] = map[j-1][i];
							map[j-1][i]=0;
						}
					}
					count_t--;
				}
			
			}
		//	max = find_max(max, map);
			break;
	
		}

		
		return map;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		n = sc.nextInt();
		int [][]map = new int [21][21];
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n; k++) {
				map[i][k] = sc.nextInt();
			}
		}
		int count=0;
		dfs(map, count);
		
		
//		for(int i=1; i<=n; i++) {
//			int find = 0;
//			for(int j=2 ; j<=n ; j++) {
//				
//				if(map[i][j] == 0) {
//					find+=1;
//					continue;
//				}
//					
//				if(map[i][j-1 -find] == map[i][j])
//				{
//					map[i][j-1-find] += map[i][j];
//					map[i][j] =0;
//					
//				}
//
//			}
//			int count_t = 21;
//			while(count_t>0) {
//				for(int j=2; j<=n-1; j++) {
//					
//					if(map[i][j]==0) {
//						map[i][j] = map[i][j+1];
//						map[i][j+1]=0;
//					}
//				}
//				count_t--;
//			}
//		
//		}
		
//
//		for(int i=1; i<=n; i++) {
//			int find = 0;
//			for(int j=n-1 ; j>=1 ; j--) {
//				
//				if(map[i][j] == 0) {
//					find+=1;
//					continue;
//				}
//					
//				if(map[i][j+find+1] == map[i][j])
//				{
//					map[i][j+find+1] += map[i][j];
//					map[i][j] =0;
//					
//				}
//
//			}
//			int count_t = 21;
//			while(count_t>0) {
//				for(int j=n; j>=2; j--) {
//					
//					if(map[i][j]==0) {
//						map[i][j] = map[i][j-1];
//						map[i][j-1]=0;
//					}
//				}
//				count_t--;
//			}
//		
//		}
//		
//		for(int i=1; i<=n; i++) {
//			int find = 0;
//			for(int j=2 ; j<=n ; j++) {
//				
//				if(map[j][i] == 0) {
//					find+=1;
//					continue;
//				}
//					
//				if(map[j-1-find][i] == map[j][i])
//				{
//					map[j-1-find][i] += map[j][i];
//					map[j][i] =0;
//					
//				}
//
//			}
//			int count_t = 21;
//			while(count_t>0) {
//				for(int j=1; j<=n-1; j++) {
//					
//					if(map[j][i]==0) {
//						map[j][i] = map[j+1][i];
//						map[j+1][i]=0;
//					}
//				}
//				count_t--;
//			}
//		
//		}


//		for(int i=1; i<=n; i++) {
//			int find = 0;
//			for(int j=n-1 ; j>=1 ; j--) {
//				
//				if(map[j][i] == 0) {
//					find+=1;
//					continue;
//				}
//					
//				if(map[j+1+find][i] == map[j][i])
//				{
//					map[j+1+find][i] += map[j][i];
//					map[j][i] =0;
//					
//				}
//
//			}
//			int count_t = 21;
//			while(count_t>0) {
//				for(int j=n-1; j>=2; j--) {
//					
//					if(map[j][i]==0) {
//						map[j][i] = map[j-1][i];
//						map[j-1][i]=0;
//					}
//				}
//				count_t--;
//			}
//		
//		}
//		
		
		
		/*
		 * 4
2 2 4 2
2 2 2 2
2 2 2 2
2 2 2 2

4 4 2 0

4 2 2 0
4 4 0 0






4
4 0 4 4
2 2 0 4
2 2 4 2
2 2 2 2


8 4 0 0 
4 4 0 0 
4 4 2 0 
4 4 0 0 

		 * 
		 */
		
		
	
		
		System.out.println(max);

	}

}

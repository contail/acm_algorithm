package problem_14500;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[][] = new int [n][m];
		for(int i=0; i<n; i++) {
			for(int k=0; k<m;k++)
				arr[i][k] = sc.nextInt();
		}
			
		int max =0;
		int sum=0;	
		
		///첫번째 모양 시
		for(int i=0; i<n; i++) {
			if(i+1>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+4 > m)
					break;
				sum = arr[i][k]+arr[i][k+1]+arr[i][k+2]+arr[i][k+3];
				
				if(max <sum)
					max = sum;
			}
		}
		
		
		for(int i=0; i<n; i++) {
			if(i+4 >n)
				break;
			for(int k=0; k<m; k++) {
				if(k+1 >m)
					break;
				sum = arr[i][k]+arr[i+1][k]+arr[i+2][k]+arr[i+3][k];
				if(max <sum)
					max = sum;
			}
		}
		
		
		////2번째 모양 시
		
		for(int i=0; i<n; i++) {
			if(i+2>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+2 >m)
					break;	
				sum = arr[i][k] +arr[i][k+1] + arr[i+1][k] +arr[i+1][k+1];
				if(max <sum)
					max = sum;
				
			}
		}
		////////////////////////////////////////////////////3번째 모양 시작 (8개)
		
		
		for(int i=0; i<n; i++) {
			if(i+3>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+2 >m)
					break;	
				sum = arr[i][k]+arr[i+1][k]+arr[i+2][k]+arr[i+2][k+1];
				if(max <sum)
					max = sum;
				
			}
		}
		
		//2번
		for(int i=0; i<n; i++) {
			if(i+2>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+3 >m)
					break;	
				sum = arr[i][k] + arr[i+1][k]+arr[i][k+1]+arr[i][k+2];
				if(max <sum)
					max = sum;
				
			}
		}
		
		
		//3
		for(int i=0; i<n; i++) {
			if(i+3>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+2 >m)
					break;	
				sum = arr[i][k] + arr[i][k+1]+arr[i+1][k+1]+arr[i+2][k+1];
				if(max <sum)
					max = sum;
				
			}
		}
		
		for(int i=0; i<n; i++) {
			if(i+2>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+3 >m)
					break;	
				sum = arr[i+1][k]+arr[i+1][k+1]+arr[i+1][k+2]+arr[i][k+2];
				if(max <sum)
					max = sum;
				
			}
		}
	
		
		//5번째 (대칭시작)
		for(int i=0; i<n; i++) {
			if(i+3>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+2 >m)
					break;	
				sum = arr[i+2][k]+arr[i+2][k+1]+arr[i+1][k+1]+arr[i][k+1];
				if(max <sum)
					max = sum;
				
			}
		}
	
		
		//6번
		for(int i=0; i<n; i++) {
			if(i+2>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+3 >m)
					break;	
				sum = arr[i][k] + arr[i][k+1]+arr[i][k+2]+arr[i+1][k+2];
				if(max <sum)
					max = sum;
				
			}
		}
		
		
		//7
		for(int i=0; i<n; i++) {
			if(i+3>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+2 >m)
					break;	
				sum = arr[i][k] + arr[i][k+1]+arr[i+1][k]+arr[i+2][k];
				if(max <sum)
					max = sum;
				
			}
		}
		
		
		//8
		
		for(int i=0; i<n; i++) {
			if(i+2>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+3 >m)
					break;	
				sum = arr[i][k]+arr[i+1][k]+arr[i+1][k+1]+arr[i+1][k+2];
				if(max <sum)
					max = sum;
				
			}
		}
		
		
		/////////////////////////4번째 모양 시작
		for(int i=0; i<n; i++) {
			if(i+3>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+2 >m)
					break;	
				sum =arr[i][k]+arr[i+1][k]+arr[i+1][k+1]+arr[i+2][k+1];
			
				if(max <sum)
					max = sum;
				
			}
		}
		
		for(int i=0; i<n; i++) {
			if(i+3>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+2 >m)
					break;	
				sum =arr[i][k+1]+arr[i+1][k+1]+arr[i+1][k]+arr[i+2][k];
				if(max <sum)
					max = sum;
				
			}
		}
		
		for(int i=0; i<n; i++) {
			if(i+2>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+3>m)
					break;	
				sum =arr[i+1][k]+arr[i+1][k+1]+arr[i][k+1]+arr[i][k+2];
				if(max <sum)
					max = sum;
				
			}
		}
		
		for(int i=0; i<n; i++) {
			if(i+2>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+3 >m)
					break;	
				sum =arr[i][k]+arr[i][k+1]+arr[i+1][k+1]+arr[i+1][k+2];
				if(max <sum)
					max = sum;
				
			}
		}
		
		//////////////5번째 모양 시작/////////
		
		for(int i=0; i<n; i++) {
			if(i+2>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+3 >m)
					break;	
				sum   = arr[i+1][k] +arr[i+1][k+1]+arr[i][k+1]+arr[i+1][k+2];
				if(max <sum)
					max = sum;
				
			}
		}
		
		for(int i=0; i<n; i++) {
			if(i+3>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+2>m)
					break;	
				sum   = arr[i][k] +arr[i+1][k]+arr[i+2][k]+arr[i+1][k+1];
				if(max <sum)
					max = sum;
				
			}
		}
		
		for(int i=0; i<n; i++) {
			if(i+2>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+3 >m)
					break;	
				sum   = arr[i][k] + arr[i][k+1]+arr[i][k+2]+arr[i+1][k+1];
				if(max <sum)
					max = sum;
				
			}
		}
		
		for(int i=0; i<n; i++) {
			if(i+3>n)
				break;
			for(int k=0; k<m; k++) {
				if(k+2 >m)
					break;	
				sum   = arr[i][k+1] + arr[i+1][k]+arr[i+1][k+1]+arr[i+2][k+1];
				if(max <sum)
					max = sum;
				
			}
		}
		
		System.out.println(max);
		
		// TODO Auto-generated method stub

	}

}

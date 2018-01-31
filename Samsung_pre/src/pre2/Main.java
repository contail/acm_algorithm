package pre2;

import java.util.*;

public class Main {

	static long max = Long.MIN_VALUE;
	static long min = Long.MAX_VALUE;
	
	static int n ;
	static int num[];
	static int calc[];

	public static void dfs( int level) {

		if (level == n - 1) {

			min = min > num[n - 1] ? num[n - 1] : min;
			max = max > num[n - 1] ? max : num[n - 1];

			return;
		}

		else {
			for(int i=0; i<4; i++) {
				if(calc[i] ==0)
					continue;
				else {
					if( i==0) {
						calc[i]--;
						int temp =num[level+1];
						num[level+1] = num[level] +num[level+1];
						dfs(level+1);
						num[level+1] = temp;
						calc[i]++;
					}
					else if(i==1) {
						calc[i]--;
						int temp =num[level+1];
						num[level+1] = num[level] -num[level+1];
						dfs(level+1);
						num[level+1] = temp;
						calc[i]++;
					}
					else if(i==2) {
						calc[i]--;
						int temp =num[level+1];
						num[level+1] = num[level] * num[level+1];
						dfs(level+1);
						num[level+1] = temp;
						calc[i]++;
					}
					else {
						calc[i]--;
						int temp =num[level+1];
						num[level+1] = num[level] / num[level+1];
						dfs(level+1);
						num[level+1] = temp;
						calc[i]++;
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		 n = sc.nextInt();
		 num = new int[n];

		calc = new int[4];

		// 계산 입
		for (int i = 0; i < 4; i++) {
			calc[i] = sc.nextInt();
		}

		// 숫자 입력
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < 4; i++) {
			if (calc[i] == 0) {
				continue;
			}

			calc[i]--;
			if( i==0) {
				int temp =num[1];
				num[1] = num[0] +num[1];
				dfs(1);
				num[1] = temp;
			}
			else if(i==1) {
				int temp =num[1];
				num[1] = num[0] - num[1];
				dfs(1);
				num[1] = temp;
			}
			else if(i==2) {
				int temp =num[1];
				num[1] = num[0] *num[1];
				dfs(1);
				num[1] = temp;
			}
			else {
				int temp =num[1];
				num[1] = num[0] /num[1];
				dfs(1);
				num[1] = temp;
			}
			calc[i]++;

		}
		
		System.out.println(max);
		System.out.println(min);
		// TODO Auto-generated method stub

	}

}

/*
 * 
 * n = 4
 * 
 * 2 2 2 2
 * 
 * 1 2 3 4 5
 * 
 * 
 * 
 * 3 -5 / 2
 * 
 * 3 -3 / 3 + 3
 * 
 * 1 + 2
 * 
 * 
 */
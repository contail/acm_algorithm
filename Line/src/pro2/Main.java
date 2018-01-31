package pro2;

import java.util.Scanner;

public class Main {
	/*
	 * Description : 
	 * Time complexity : n -> 반복문 1개  
	 * Space complexity : 1 ->단순 상수의 공간활
	 */
	static int cnt=0;
	public int calc(long n) {

		for (long i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				cnt++;
				if (i * i < n) {
					cnt++;
				}
			}
		}

		// TODO : implement your codes to here.
		return cnt;
	}

	public static void main(String[] args) throws Exception {
		Main main = new Main();

		Scanner scanner = new Scanner(System.in);

		long n = scanner.nextLong();

		System.out.println(main.calc(n));

		scanner.close();
	}
}
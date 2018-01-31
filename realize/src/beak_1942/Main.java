package beak_1942;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int x = sc.nextInt();
		int y = sc.nextInt();

		int yo1[] = { 0, 1, 2, 3, 4, 5, 6 };
		int month[][] = new int[13][32];

		int index = 0;
		for (int i = 1; i <= 31; i++) {
			if (index == 7)
				index = 0;
			month[1][i] = yo1[index++];
		}
		for (int i = 1; i <= 28; i++) {
			if (index == 7)
				index = 0;
			month[2][i] = yo1[index++];
		}

		for (int i = 1; i <= 31; i++) {
			if (index == 7)
				index = 0;
			month[3][i] = yo1[index++];
		}

		for (int i = 1; i <= 30; i++) {
			if (index == 7)
				index = 0;
			month[4][i] = yo1[index++];
		}

		for (int i = 1; i <= 31; i++) {
			if (index == 7)
				index = 0;
			month[5][i] = yo1[index++];
		}
		for (int i = 1; i <= 30; i++) {
			if (index == 7)
				index = 0;
			month[6][i] = yo1[index++];
		}
		for (int i = 1; i <= 31; i++) {
			if (index == 7)
				index = 0;
			month[7][i] = yo1[index++];
		}
		for (int i = 1; i <= 31; i++) {
			if (index == 7)
				index = 0;
			month[8][i] = yo1[index++];
		}

		for (int i = 1; i <= 30; i++) {
			if (index == 7)
				index = 0;
			month[9][i] = yo1[index++];
		}
		for (int i = 1; i <= 31; i++) {
			if (index == 7)
				index = 0;
			month[10][i] = yo1[index++];
		}
		for (int i = 1; i <= 30; i++) {
			if (index == 7)
				index = 0;
			month[11][i] = yo1[index++];
		}
		for (int i = 1; i <= 31; i++) {
			if (index == 7)
				index = 0;
			month[12][i] = yo1[index++];
		}

		if (month[x][y] == 0) {
			System.out.println("MON");
		} else if (month[x][y] == 1) {
			System.out.println("TUE");
		} else if (month[x][y] == 2) {
			System.out.println("WED");
		} else if (month[x][y] == 3) {
			System.out.println("THU");
		} else if (month[x][y] == 4) {
			System.out.println("FRI");
		} else if (month[x][y] == 5) {
			System.out.println("SAT");
		} else if (month[x][y] == 6) {
			System.out.println("SUN");
		}

	}

}

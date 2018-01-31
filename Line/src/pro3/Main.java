package pro3;

import java.util.Scanner;

public class Main {
    private static final int PEG_MAX_SIZE = 3;

    private static final int DISK_MAX_SIZE = 20;

    /*
     * Description :
     * Time complexity :
     * Space complexity :
     */
    public int find(int[][] pepsGiven) {
        // TODO: implement your codes to here.
        return 0;
    }

    public static void main(String[] args) throws Exception {
        int[][] pegsGiven = new int[PEG_MAX_SIZE][DISK_MAX_SIZE];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < PEG_MAX_SIZE; i++) {
            String line = scanner.nextLine();
            if (line == null || line.length() <= 0) {
                continue;
            }
            String[] nums = line.split(" ");
            for (int j = 0; j < nums.length && i < DISK_MAX_SIZE; j++) {
                pegsGiven[i][j] = Integer.parseInt(nums[j]);
            }
        }
        scanner.close();

        System.out.println(new Main().find(pegsGiven));
    }
}
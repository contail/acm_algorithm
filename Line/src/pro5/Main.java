package pro5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
     * Description :
     * Time complexity :
     * Space complexity :
     */
    public int calc(int []numbers) {
    	
    		int count =0;
    		boolean check = false;
    		boolean current_check = false;
    		if(numbers.length>2) {
    			
    			if(numbers[0] - numbers[1] <0) {
    				current_check = false;
    			}
    			else {
    				current_check = true;
    			}
    			
    			for(int i=1; i<numbers.length-1; i++) {
        			if(numbers[i] - numbers[i+1] < 0) {
        				check = false;
        			}
        			else {
        				check = true;
        			}
        			if(current_check == check)
        			{
        				count++;
        			}
        			else {
        				current_check = check;
        			}
        		
        		}
    		}
    		
        /* TODO implement your codes to here. */
        return count;
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []numbers = new int[n];
        int []temp = new int[n];
        for (int i=0; i<n; i++) {
            numbers[i] = scan.nextInt();
        }
        

        System.out.println(n - main.calc(numbers));
        scan.close();
    }
}
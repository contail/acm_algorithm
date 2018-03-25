package beak_6603;

import java.util.*;


public class Main {
	
	static int testcase;
    	static int value_arr [];
    	static int result [];
	public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        
        	
        while(true) {
        		testcase = sc.nextInt();	
        		if (testcase == 0) break;
        		
        		value_arr = new int [testcase+1];
        		result = new int [testcase+1];
        		
        		for (int i=0; i<testcase; i++) {
        			value_arr[i] = sc.nextInt();
        		}
        		
        		dfs(0,0);
        		
        }
    }
    
    public static void dfs (int start, int depth) {
    		
	    	if(depth == 6) {
	    		print();
	    	}
	    	
	    	for(int i=start; i<testcase; i++) {
	    		result[i] = 1;
	    		dfs(i+1, depth+1);
	    		result[i] = 0;
	    	}
	    	
    }
    
    public static void print ()
    {
    		for(int i=0; i<testcase; i++) {
    			if(result[i]==1)
    				System.out.print(value_arr[i] + " ");
    		}
    		System.out.println();
    }
}
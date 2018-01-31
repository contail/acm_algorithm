package pro4;

import java.util.Scanner;

class Main {

    private int[][] graph;
    private int N;
    private static boolean check[];
    
    

    /*
     * Description :
     * Time complexity :
     * Space complexity :
     */
    private boolean solve() {
        // TODO implement your code to here.
    	
    		
    		for(int i=0; i<N;i++) {
    			
    			for(int j=0; j<N; j++) {
    				
    				for(int k=1; k<N; k++) {
    					  
    					for(int x=0; x<N; x++) {
    						if(graph[i][j] == graph[k][x])
            					continue;
            				else
            					check[i] =true;
    					}
        				
        			}
    			}
    			
    			
    			
    			
    		}
    		
    		for(int i=0; i<N; i++) {
    			if(check[i] ==false) {
    				
    			}
    		}
    		
        return false;
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        try (Scanner scan = new Scanner(System.in)) {
            int T = scan.nextInt();
            for (int t = 0; t < T; t++) {
                int N = scan.nextInt();
                main.N = N;
                main.graph = new int[N][N];
                check = new boolean[N];

                int K = scan.nextInt();

                for (int i = 0; i < K; i++) {
                    int P = scan.nextInt();
                    int S = scan.nextInt();
                    main.graph[P][S] = 1;
                }
                System.out.println(main.solve() ? 'O' : 'X');
            }
        }
    }
}

package problem_6;
import java.util.*;
public class Main {
   
      
    static int max(int a,int b) {
        return (a>b) ? a : b;
    }
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int N;  
         int testcase = sc.nextInt(); 
         int [] Wi;  
         int [] Pi;  
         int [][] D; 
       
      
        N=testcase;
          
        Wi = new int[N+1];
        Pi = new int[N+1];
        D = new int[N+1][testcase+1];
          
        for(int i=1; i<=N; i++) {
            Wi[i] = i;
            Pi[i] = sc.nextInt();
        }
          
      
        for(int i=1; i<=N; i++) {       
            for(int j=1; j<=testcase; j++) {
                if(j-Wi[i]<0) {
                    D[i][j] = D[i-1][j]; 
                } else {
                    D[i][j] = max(D[i][j-Wi[i]]+Pi[i],D[i-1][j]);
                }
            }
        }
          
        System.out.println(D[N][testcase]);
        sc.close();
    }
}
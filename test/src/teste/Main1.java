package teste;

public class Main1 {

	class TryHelloWorld {
		public int tiling(int n) {
			int answer = 0;
	    int arr[] = new int[n+1];
	    arr[0]=1;
	    arr[1]=1;
	     String b ="";
	    String a ="";
	    for(int i=2; i<=n; i++){
	    arr[i] = (arr[i-2]+arr[i-1])%100;
	      a= arr[n]+"";
	   
	    if(a.length()>4){    
	      if(a.charAt(4) =='0')
	    	 b = a.substring(5, a.length());
	      else{
	        b = a.substring(4, a.length());
	      }   
	    }
	    }
	    System.out.println(a);
	  	return Integer.parseInt(b); 		
		}

		public void main (String args[]) {
			TryHelloWorld tryHelloWorld = new TryHelloWorld();
			// 아래는 테스트로 출력해 보기 위한 코드입니다.
			System.out.print(tryHelloWorld.tiling(12));
		}
	}

}

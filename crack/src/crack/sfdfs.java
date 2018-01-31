package crack;

public class sfdfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = FUNC();
		System.out.println(a);
	}
	
	public static int FUNC() {
	    int cnt = 0;
	    for (int i = 0; i <= 1024; ++i) {
	        
	        if ((i & (i - 1)) == 0) {
	            ++cnt;
	        }
	    }
	    return cnt;
	}

}

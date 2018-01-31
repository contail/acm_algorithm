package Pro1;
import java.util.Scanner;
import java.util.Stack;
class Main {
/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
////// BEGIN OF EDIT AREA.
/////////////////////////////////////////////////////////////////////////

    // Implement this class.
    // Please use stack only.
    static class Queue {
        /*
         * Description:
         * Time complexity:
         * Space complexity:
         */
	    	Stack<Integer> stack_1 = new Stack<Integer>();
	    	Stack<Integer> stack_2 = new Stack<Integer>();
        public void enqueue(int v) {
            // TODO implement your codes to here.
        			stack_1.push(v);
        }

        /*
         * Description:
         * Time complexity:
         * Space complexity:
         */
        
        public int dequeue() {
        	if(stack_2.size()==0){	//stack_2 가 비어있을 경우
    			while(stack_1.size()>0){	//stack_1 이 비어있지 않을 경우
    				stack_2.push(stack_1.pop());
    			}
    		}
    		return stack_2.pop();
        }
    }

/////////////////////////////////////////////////////////////////////////
////// END OF EDIT AREA.
/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            Queue queue = new Queue();
            int count = scan.nextInt();
            for (int i = 0; i < count; ++ i) {
                String command = scan.next();
                if ("ENQUEUE".equals(command)) {
                    int value = scan.nextInt();
                    queue.enqueue(value);
                } else if ("DEQUEUE".equals(command)) {
                    System.out.println(queue.dequeue());
                }
            }
        }
    }
}

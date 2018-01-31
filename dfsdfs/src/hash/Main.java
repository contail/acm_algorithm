package hash;
import java.util.*;
public class Main {
	
	
	static int table[];
	static int count;
	
	static public void init() {
		table = new int[2];
		count =0;
	}
	static int hash(int value) {
		return value % table.length;
	}
	
	static int next(int value) {
		int i = hash(value);
		int end = i+table.length;
		
		while(table[hash(i)]!=0 && (i<end)) {
			i+=1;
		}
		return hash(i);
	}
	
	static boolean find(int value) {
		int i = hash(value);
		int end = i+ table.length;
		while(table[hash(i)]!=0 && (i<end)) {
			if (value ==table[hash(i)]) {
				return true;
			}
			i+=1;
		}
		return false;
	}
	
	static boolean add(int value) {
		if (find(value)) {
			return false;
		}
		if( count+1 > table.length) {
			resize();
		}
		
		table[next(value)] = value;
		count +=1;
		return true;
	}
	
	static void resize() {
		int old_table[] = table;
		table = new int[old_table.length *2];
		int i=0;
		
		while (i < old_table.length) {
			int value = old_table[i];
			if (value!=0) {
				table[next(value)] = value;
			}
			i+=1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		init();
		add(32);
		add(51);
		add(16);
//		add(13);
//		add(48);
//		add(45);
//		add(42);
//		add(17);
		
		for(int i=0; i<table.length; i++)
			System.out.print(table[i] + " ");
		// TODO Auto-generated method stub

	}

}

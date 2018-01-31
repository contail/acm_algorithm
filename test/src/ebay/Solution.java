package ebay;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static class LinkedListNode {
		int val;
		LinkedListNode next;

		LinkedListNode(int node_value) {
			val = node_value;
			next = null;
		}
	};

	static LinkedListNode distinct(LinkedListNode n) {
		Hashtable table = new Hashtable();
		ArrayList al = new ArrayList();
		LinkedListNode pv = null;
		LinkedListNode head = null;
		LinkedListNode head_tail = null;	
		while (n != null) {

			if (table.containsKey(n.val)) {
				pv.next = n.next;
			} else {
				table.put(n.val, true);
				pv = n;
				al.add(n.val);
			}
			n = n.next;
		}
		for (int i = 0; i < al.size(); i++) {
			int head_item;
			head_item = (int) al.get(i);
			head_tail = _insert_node_into_singlylinkedlist(head, head_tail, head_item);
			if (i == 0) {
				head = head_tail;
			}
		}
		return head;
	}

	public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, LinkedListNode tail, int val) {
		if (head == null) {
			head = new LinkedListNode(val);
			tail = head;
		} else {
			tail.next = new LinkedListNode(val);
			tail = tail.next;
		}
		return tail;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedListNode res;
		int head_size = 0;
		LinkedListNode head = null;
		LinkedListNode head_tail = null;
		head_size = 6;

		int arr[] = { 3, 4, 3, 2, 6, 1, 2, 6, };
		for (int i = 0; i < arr.length; i++) {
			int head_item;
			head_item = arr[i];
			head_tail = _insert_node_into_singlylinkedlist(head, head_tail, head_item);
			if (i == 0) {
				head = head_tail;
			}
		}

		res = distinct(head);

		System.out.println(head.val);

	}

}

package come.test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Spliterator;
import java.util.Stack;
import java.util.Vector;

public class QueueTest {
	public static void main(String args[]){
        LinkedList ls = new LinkedList<>();
       // ls.r
        Stack<String> st = new Stack<String>();
        st.add("1");
        st.push("2");
        System.out.println(st.pop());System.out.println(st.pop());
        Vector<String> vc = new Vector<String>();
        vc.add("sss");
        vc.
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");
		queue.add("Xyz1223");
		//Spliterator<String> itre = queue.spliterator();
		//itre.

		//System.out.println("head:"+queue.element());
		//System.out.println("head:"+queue.peek());
System.out.println(queue.poll());
System.out.println(queue.poll());
System.out.println(queue.poll());
System.out.println(queue.poll());
System.out.println(queue.poll());
System.out.println(queue.poll());

ArrayDeque<String> ad = new ArrayDeque<String>();

		System.out.println("iterating the queue elements:");
		Iterator itr=queue.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}

		//queue.remove();
		///queue.poll();

		System.out.println("after removing two elements:");
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()){
		System.out.println(itr2.next());
		}

		}
}


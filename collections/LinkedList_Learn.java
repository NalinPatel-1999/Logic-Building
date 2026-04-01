package collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> ll = new LinkedList<Integer> ();
		
		ll.add(10);
		ll.add(20);
		
		System.out.println(ll);
		
		for(int i = 1; i<=100; i++) {
			ll.add(i);
		}
		System.out.println(ll);
		
		Iterator <Integer> itr = ll.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}

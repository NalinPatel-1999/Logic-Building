package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class Learn_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		
		/*
		 * al.add("Nalin"); al.add("Patel"); al.add("Sachin"); al.add("Bamotriya");
		 * al.add("Mohit"); al.add("Singh");
		 */
		
		al.clear();
		
		for(int i = 1; i<=100; i++) {
			al.add(i);
		}
		System.out.println(al);
		
		Iterator <Integer> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

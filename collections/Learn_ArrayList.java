package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class Learn_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> al = new ArrayList<String>();
		
		al.add("Nalin");
		al.add("Patel");
		al.add("Sachin");
		al.add("Bamotriya");
		al.add("Mohit");
		al.add("Singh");
		
		System.out.println(al);
		
		Iterator <String> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

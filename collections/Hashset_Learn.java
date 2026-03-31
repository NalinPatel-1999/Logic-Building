package collections;

import java.util.HashSet;
import java.util.Iterator;
public class Hashset_Learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet <String> cars = new HashSet<String>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		cars.add(null);
		cars.add(null);
		
		System.out.println(cars);
		
		Iterator <String> itr = cars.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}

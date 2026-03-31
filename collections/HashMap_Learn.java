package collections;
import java.util.HashMap;
public class HashMap_Learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String, String> hs = new HashMap<String, String>();
		
		hs.put("England", "London");
		hs.put("India", "Delhi");
		hs.put("Germany", "Berlin");
		hs.put("Norway", "Oslo");
		hs.put(null, null);
		hs.put(null, null);
		hs.put("Norway", "Oslo");
		
		System.out.println(hs);

	}

}

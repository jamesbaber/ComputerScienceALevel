package May3HashMaps;
import java.util.*;

public class Times {
	public static void main(String args[]) {
		/*
		
		// Create a hash mapk
		HashMap hm = new HashMap();
		
		// Put elements to the map
		hm.put("StopA", new String[] {"06:55", "07:25", "07:55", "08:55", "09:55", "11:55", "14:00", "15:00", "15:30", "16:00"});
		hm.put("StopB", new String[] {"06:40", "07:40", "08:40", "09:20", "09:40", "14:00", "15:00", "16:00", "16:30"});
		  
		// Get a set of the entries
		Set set = hm.entrySet();
		  
		// Get an iterator
		Iterator i = set.iterator();
		  
		// Display elements
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(Arrays.toString(me.getValue()));
		}
		System.out.println();

		*/
		// Create a HashMap of fruit and their color.
        HashMap<String, String> fruit = new HashMap<>();
        fruit.put("apple", "red");
        fruit.put("orange", "orange");
        fruit.put("banana", "yellow");
        fruit.put("raspberry", "red");

        // See if there is a red value.
        if (fruit.containsValue("red")) {
            System.out.println("Red fruit detected!");

            // Loop over all keys and print them if they have "red" values.
            for (String key : fruit.keySet()) {
                if (fruit.get(key) == "red") {
                    System.out.println(key);
                }
            }
        }
	}
}

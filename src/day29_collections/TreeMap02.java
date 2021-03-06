package day29_collections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap02 {

	public static void main(String[] args) {
		
		  //This is how to declare TreeMap 
	      TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

	      //put() adds elements to TreeMap
	      treeMap.put(1, "Mark");    //{1=Mark}
	      treeMap.put(43, "Amanda"); //{1=Mark, 43=Amanda}
	      treeMap.put(35, "John");   //{1=Mark, 35=John, 43=Amanda}
	      System.out.println(treeMap); //{1=Mark, 35=John, 43=Amanda}

	      // Display content using Iterator
	      Iterator iterator = treeMap.entrySet().iterator();
	      while(iterator.hasNext()) {
	    	 // Map.Entry interface provides certain methods to access the entry in the Map. 
	    	 // By gaining access to the entry of the Map we can easily manipulate them. 
	         Map.Entry mapEntry = (Map.Entry)iterator.next();
	         System.out.println("Key:"+ mapEntry.getKey() + " Value:" + mapEntry.getValue());
	      }
	}
}



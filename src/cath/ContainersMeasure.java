package cath;
import java.util.*;

public class ContainersMeasure {
	static Random r = new Random();
	static Collection fill(Collection<Integer> collection) {
		for (int i=0; i<10000;i++) {
			collection.add (r.nextInt(999999));
			
		}
		
	return 	collection;
	}
	
	static Map fill(Map<Integer, String> map) {
		for (int i=0; i<10000;i++) {
			map.put (r.nextInt(999999), "Cake Store");
			
		}
		
	return 	map;
	}
	
	static void ArrayListOperations () {
		long startTime = System.nanoTime();
		Collection<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(10);
		System.out.println(arrlist.add(10));
		arrlist.remove(10);
		System.out.println(arrlist.remove(10));
		arrlist.contains(10);
		System.out.println(arrlist.contains(10));
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Total time for ArrayList is: " + totalTime);
		
	}
	
	static void LinkedListOperations () {
		long startTime = System.nanoTime();
		Collection<Integer> llist = new LinkedList<Integer>();
		llist.add(10);
		System.out.println(llist.add(10));
		llist.remove(10);
		System.out.println(llist.remove(10));
		llist.contains(10);
		System.out.println( llist.contains(10));
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Total time for Linked List is: " + totalTime);
	}
	static void HashSetOperations () {
		long startTime = System.nanoTime();
		Collection<Integer> hass = new HashSet<Integer>();
		hass.add(10);
		System.out.println(hass.add(10));
		hass.remove(10);
		System.out.println(hass.remove(10));
		hass.contains(10);
		System.out.println( hass.contains(10));
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Total time for HashSet is: " + totalTime);
	}

		
	static void TreeSetOperations () {
		long startTime = System.nanoTime();
		Collection<Integer> trees = new TreeSet<Integer>();
		trees.add(10);
		System.out.println(trees.add(10));
		trees.remove(10);
		System.out.println(trees.remove(10));
		trees.contains(10);
		System.out.println( trees.contains(10));
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Total time for TreeSet is: " + totalTime);
	}
	
	static void HashMapOperations () {
		long startTime = System.nanoTime();
		Map<Integer, String> hasm = new HashMap<Integer, String>();
		hasm.put(10, "Test");
		System.out.println(hasm.put(10, "Test"));
		hasm.remove(10, "Test");
		System.out.println(hasm.remove(10, "Test"));
		hasm.containsKey(10);
		System.out.println( hasm.containsKey(10));
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Total time for HashMap is: " + totalTime);
	}
	
	
	static void TreeMapOperations () {
		long startTime = System.nanoTime();
		Map<Integer, String> treem = new TreeMap<Integer, String>();
		treem.put(10, "Test");
		System.out.println(treem.put(10, "Test"));
		treem.remove(10, "Test");
		System.out.println(treem.remove(10, "Test"));
		treem.containsKey(10);
		System.out.println( treem.containsKey(10));
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Total time for TreeMap is: " + totalTime);
	}
	
	
	
	public static void main(String[]args) {
		System.out.println(fill(new LinkedList<Integer>()));
		ArrayListOperations ();
		LinkedListOperations();
		HashSetOperations();
	    TreeSetOperations();
	    HashMapOperations();
	    TreeMapOperations();
	    
		
		
	}

}

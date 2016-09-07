import java.util.*;

//child class of hashset
/*diff b/w hashset and linkedhashset is order is preserved
 * HashSet=HashTable+LinkedList
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet h=new LinkedHashSet();
		h.add("a");
		h.add("a");
		h.add("b");
		h.add("b");
		h.add("c");
		h.add("c");
		h.add(null);
		h.add(10);
		System.out.println(h.add("a"));//return false
		System.out.println(h);
	}
}

/*Usage
 * Cache based applications use LinkedHashSet 
 * 
 */

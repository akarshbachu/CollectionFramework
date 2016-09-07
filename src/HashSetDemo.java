import java.util.HashSet;

//Set (hashset and SortedSet)
/*hashset->linkedhashset
    sortedset ->navigableset->treeset
 */
/* 1)set is child interface of collection
 * 2)duplicate values are not allowed
 * 3)it doesnt contain any new methods rather it only uses methods of Collection Interface 
 */

/* -----HASHSET ------*/
/* 1)hashset is constructed based on HashTable
 * 2)duplication is not allowed if we try to do this obj.add("a") obj.add("a") it doesn't give any 
 * 	error or exception, but add method returns false.
 * 3)order is not preserved
 * 4)heterogenous objs allowed
 * 5)null is allowed
 * 6)can implement serializable and clonable interfaces
 * 7)for searching hashset is best framework.
 */

//-------- 4 hashset constructors----
/* 1)HashSet h=new HashSet();
 * initial capacity 16(i.e size) with default fill ratio:0.75
 * 	fill ratio is called as LOAD FACTOR i.e after 75% of 16 is occupied
 * the new object is going to created with larger size
 * 
 * 2)HashSet h=new HashSet(int initialCapacity);//for customized load capacity
 * 3)HashSet h=new HashSet(int initialCapacity,float loadFactor);
 * 4)HashSet h=new HashSet(Collection c); //creates the hashset for given Collection obj.
 * 
 */
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
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

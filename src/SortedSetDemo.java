import java.util.*;
//duplication not allowed
/*it has 6 specific methods
 * first()->first ele of set
 * last()
 * headSet(num)->nums less than num
 * tailSet(num)->nums greater than num are printed
 * subSet(n,m)->nums>n and nums<m are printed
 * comparator()->returns comperator obj which describes underlying sorting technique
 *
 * Heterogeneous objs are not allowed as this is sorted set
 * only Treeset and Treemap doesnt support Heterogeneous objs in collectionframework
 * null is accepted only once 
 */
//Sortedset is nothing but Treeset
/* TreeSet t=new TreeSet(Comparator c)//for customized sorting
 * 
 */

public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add(null);
		t.add(5);
		t.add(1);
		t.add(2);
		//if we add null once again it will raise error
		
		HashSet s=new HashSet();
		s.add(10);
		s.add(9);
		
		t.addAll(s);//set is added to treeset
		System.out.println(t);
	}

}

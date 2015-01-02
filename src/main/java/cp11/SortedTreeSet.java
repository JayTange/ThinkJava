package cp11;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 红黑树会自动排序，而且不重复
 * @author tangj
 *
 */
public class SortedTreeSet {

	public static void main(String args[]){
		Random rand = new Random(47);
		SortedSet<Integer> intset = new TreeSet<>();
		for(int i = 0;i<100000;i++){
			intset.add(rand.nextInt(30));
		}
		System.out.println(intset);
	}
}

package cp11;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * ��������Զ����򣬶��Ҳ��ظ�
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

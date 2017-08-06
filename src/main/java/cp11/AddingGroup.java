package cp11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AddingGroup {

	static List<Integer> list = new LinkedList<Integer>();
	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		for(int i = 0;i<1000000;i++){
			list.add(i);
		}
		long after = System.currentTimeMillis();
		System.out.println(after-before+"ms");
		System.out.println("size: "+list.size());
	}

}

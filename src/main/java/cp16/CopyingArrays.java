package cp16;

import java.util.Arrays;

public class CopyingArrays {

	public static void main(String[] args) {
		int[] j = new int[7];
		int[] i = new int[10];
		Arrays.fill(i, 47);
		Arrays.fill(j, 49);
		System.out.println("i= "+Arrays.toString(i));
		System.out.println("j= "+Arrays.toString(j));
		System.arraycopy(i, 0, j, 3, j.length-4);
		System.out.println("j= "+Arrays.toString(j));
	}

}

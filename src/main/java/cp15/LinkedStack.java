package cp15;

/**
 * 这个例子使用了一个末端哨兵，来判断堆栈何时为空。 这个末端哨兵实在构造LinkedStack是创建的，
 * 然后每调用一次push（）方法，总是会返回top.item， 然后丢弃当前top所指的的Node<T>,并将top转移到下一个Node<T>,
 * 除非已经碰到了末端哨兵，否则就不能再移动了， 如果已经到了末端，客户端程序还继续调用pop()方法，他只能得到null, 说明堆栈已经空了。
 * 
 * @author tangj
 *
 * @param <T>
 */
public class LinkedStack<T> {
	private static class Node<U> {
		U item;
		Node<U> next;

		Node() {
			item = null;
			next = null;
		}

		Node(U item, Node<U> next) {
			this.item = item;
			this.next = next;
		}

		boolean end() {
			return item == null && next == null;
		}
	}

	private Node<T> top = new Node<T>();

	public void push(T item) {
		top = new Node<T>(item, top);
	}

	public T pop() {
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}
		return result;
	}

	public static void main(String args[]) {
		LinkedStack<String> lss = new LinkedStack<String>();
		for (String s : "Phaers on stun!".split(" ")) {
			lss.push(s);
		}
		String s;
		System.out.println(lss.pop());
		while ((s = lss.pop()) != null) {
			System.out.println(s);
		}
	}
}

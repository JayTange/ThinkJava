package cp4;
/**
 * 测试gc效率
 * @author 唐杰
 *
 */
public class Garbage {

	public static void main(String args[]) {
		if (args.length == 0) {
			System.err.println("useage: \n" + "java garbage before\n");
			return;
		}
		while (!Chair.f) {
			new Chair();
			String s = new String("take up space");
			System.err.println("create :" + s);
		}
		System.out.println("After all Chairs have been created:\n" + "total created = " + Chair.created
				+ ", total finalized = " + Chair.finalized);
		if (args[0].equals("before")) {
			System.out.println("gc");
			System.gc();
			System.out.println("gc之后");
			System.runFinalization();
		}
		System.out.println("bye");
		if (args[0].equals("after")) {
			System.runFinalizersOnExit(true);
		}
	}

}

class Chair {
	static boolean gcrun = false;
	static boolean f = false;
	static int created = 0;
	static int finalized = 0;
	int i;

	Chair() {
		i = ++created;
		if (created == 47) {
			System.out.println("created 47");
		}
	}

	@Override
	protected void finalize() {
		if (!gcrun) {
			gcrun = true;
			System.out.println("begin to finalize arter" + "chair have created");
		}
		if (i == 47) {
			System.err.println("Finalizing Chair #47, " + "Setting flag to stop Chair creation");
			f = true;
		}
		finalized++;
		if (finalized >= created) {
			System.out.println("已清理结束");
		}
	}
}
package cp1;

import java.util.Date;
import java.util.Properties;

public class Property {

	public static void main(String args[]) throws InterruptedException{
		System.out.println(new Date());
		Properties p = System.getProperties();
		p.list(System.out);
		System.out.println("----Memory Usage: ");
		Runtime rt = Runtime.getRuntime();
		System.out.println("hello"+rt.totalMemory());
		Thread.currentThread().sleep(5000);;
	}
}

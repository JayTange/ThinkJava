package cp14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
/**
 * 打印出一个类的方法
 * @author tangj
 *
 */
public class ShowMethods {
	private static String usage = "usage:\n"+"ShowMethods qu";
	private static Pattern p = Pattern.compile("\\w+\\.");
	
	private ShowMethods(){
		
	}
	
	public static void main(String args[]){
		if(args.length<1){
			System.out.println(usage);
			System.exit(0);
		}
		int lines = 0;
		try {
			Class<?>c = Class.forName(args[0]);
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			if(args.length == 1){
				for(Method method:methods){
					System.out.println(p.matcher(method.toString()).replaceAll(""));
				}
				for(Constructor ctor:ctors){
					System.out.println(p.matcher(ctor.toString()).replaceAll(""));
				}
				lines = methods.length+ctors.length;
			}else {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

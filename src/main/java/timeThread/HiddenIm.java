package timeThread;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import cp14.A;
import cp14.C;

public class HiddenIm {

	public static void main(String args[]) throws Exception{
		A a = C.makeB();
		a.f();
		System.out.println(a.getClass().getName());
			callHiddenMethod(a, "f");
			callHiddenMethod(a,"u");
		}
	static void callHiddenMethod(Object a,String methodName) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Method g = a.getClass().getDeclaredMethod(methodName);
		g.setAccessible(true);
		g.invoke(a);
	}
}
/**
 * 
 */
package net.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author Iver3oN Zhang
 * @date 2016Äê4ÔÂ13ÈÕ
 * @email grepzwb@qq.com
 * Hacker.java
 * Impossible is nothing
 */
public class Hacker implements MethodInterceptor {

	/* (non-Javadoc)
	 * @see net.sf.cglib.proxy.MethodInterceptor#intercept(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], net.sf.cglib.proxy.MethodProxy)
	 */
	@Override
	  public Object intercept(Object obj, Method method, Object[] args,  
	            MethodProxy proxy) throws Throwable {  
	        System.out.println("**** I am a hacker,Let's see what the poor programmer is doing Now...");  
	        proxy.invokeSuper(obj, args);  
	        System.out.println("****  Oh,what a poor programmer.....");  
	        return null;  
	    }  

}

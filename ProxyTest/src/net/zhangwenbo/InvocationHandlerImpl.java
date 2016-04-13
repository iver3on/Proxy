/**
 * 
 */
package net.zhangwenbo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Iver3oN Zhang
 * @date 2016年4月13日
 * @email grepzwb@qq.com InvocationHandlerImpl.java Impossible is nothing
 */
public class InvocationHandlerImpl implements InvocationHandler {

	private Station station;

	public InvocationHandlerImpl(Station station) {
		super();
		this.station = station;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object,
	 * java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("调用车站的服务");
		System.out.println("You are going to invoke " + method.getName()
				+ " ...");
		method.invoke(station, null);
		System.out.println(method.getName()
				+ " invocation Has Been finished...");
		return null;
	}

}

/**
 * 测试主类
 */
package net.zhangwenbo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Iver3oN Zhang
 * @date 2016年4月13日
 * @email grepzwb@qq.com Test.java Impossible is nothing
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Station station = new Station(); StationProxy proxy = new
		 * StationProxy(station); proxy.sellTicket();
		 */

		Station station = new Station();
		// 1.获取对应的ClassLoader
		ClassLoader classLoader = station.getClass().getClassLoader();

		// 2.获取station 所实现的所有接口
		Class[] interfaces = station.getClass().getInterfaces();
		// 3.设置一个来自代理传过来的方法调用请求处理器，处理所有的代理对象上的方法调用
		InvocationHandler handler = new InvocationHandlerImpl(station);
		/*
		 * 4.根据上面提供的信息，创建代理对象 在这个过程中， a.JDK会通过根据传入的参数信息动态地在内存中创建和.class 文件等同的字节码
		 * b.然后根据相应的字节码转换成对应的class， c.然后调用newInstance()创建实例
		 */
		Object o = Proxy.newProxyInstance(classLoader, interfaces, handler);
		TicketService stationproxy = (TicketService) o;
		stationproxy.sellTicket();
	}

}

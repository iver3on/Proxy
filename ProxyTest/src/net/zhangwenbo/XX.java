//生成代理类的  代码
//package net.zhangwenbo;
//import net.zhangwenbo.TicketService;  
//import java.lang.reflect.InvocationHandler;  
//import java.lang.reflect.Method;  
//import java.lang.reflect.Proxy;  
//import java.lang.reflect.UndeclaredThrowableException;  
///** 
// 生成的动态代理类的组织模式是继承Proxy类，然后实现需要实现代理的类上的所有接口，而在实现的过程中，则是通过将所有的方法都交给了InvocationHandler来处理 
//*/  
// public final class StationProxy extends Proxy  
//  implements TicketService  
//{  
//  private static Method m1;  
//  private static Method m3;  
//  private static Method m4; 
//  private static Method m5; 
//  private static Method m0;  
//  private static Method m2;  
//  
//  public StationProxy(InvocationHandler paramInvocationHandler)  
//    throws   
//  {  
//    super(paramInvocationHandler);  
//  }  
//  
//  public final boolean equals(Object paramObject)  
//    throws   
//  {  
//    try  
//    { // 方法功能实现交给InvocationHandler处理  
//      return ((Boolean)this.h.invoke(this, m1, new Object[] { paramObject })).booleanValue();  
//    }  
//    catch (Error|RuntimeException localError)  
//    {  
//      throw localError;  
//    }  
//    catch (Throwable localThrowable)  
//    {  
//      throw new UndeclaredThrowableException(localThrowable);  
//    }  
//  }  
//  
//  public final void sellTicket()  
//    throws   
//  {  
//    try  
//    {  
//  
//       // 方法功能实现交给InvocationHandler处理  
//  
//      this.h.invoke(this, m3, null);  
//      return;  
//    }  
//    catch (Error|RuntimeException localError)  
//    {  
//      throw localError;  
//    }  
//    catch (Throwable localThrowable)  
//    {  
//      throw new UndeclaredThrowableException(localThrowable);  
//    }  
//  }  
//  
//  public final void inquire() throws   
//  {  
//    try  
//    {  
//  
//       // 方法功能实现交给InvocationHandler处理  
//  
//      this.h.invoke(this, m4, null);  
//      return;  
//    }  
//    catch (Error|RuntimeException localError)  
//    {  
//      throw localError;  
//    }  
//    catch (Throwable localThrowable)  
//    {  
//      throw new UndeclaredThrowableException(localThrowable);  
//    }  
//  }  
//  public final void withdraw()  
//		    throws   
//		  {  
//		    try  
//		    {  
//		  
//		       // 方法功能实现交给InvocationHandler处理  
//		  
//		      this.h.invoke(this, m5, null);  
//		      return;  
//		    }  
//		    catch (Error|RuntimeException localError)  
//		    {  
//		      throw localError;  
//		    }  
//		    catch (Throwable localThrowable)  
//		    {  
//		      throw new UndeclaredThrowableException(localThrowable);  
//		    }  
//		  }  
//  
//  public final int hashCode()  
//    throws   
//  {  
//    try  
//    {  
//  
//       // 方法功能实现交给InvocationHandler处理  
//  
//       return ((Integer)this.h.invoke(this, m0, null)).intValue();  
//    }  
//    catch (Error|RuntimeException localError)  
//    {  
//      throw localError;  
//    }  
//    catch (Throwable localThrowable)  
//    {  
//      throw new UndeclaredThrowableException(localThrowable);  
//    }  
//  }  
//  
//  public final String toString()  
//    throws   
//  {  
//    try  
//    {  
//  
//       // 方法功能实现交给InvocationHandler处理  
//      return (String)this.h.invoke(this, m2, null);  
//    }  
//    catch (Error|RuntimeException localError)  
//    {  
//      throw localError;  
//    }  
//    catch (Throwable localThrowable)  
//    {  
//      throw new UndeclaredThrowableException(localThrowable);  
//    }  
//  }  
//  
//  static  
//  {  
//    try  
//    {  //为每一个需要方法对象，当调用相应的方法时，分别将方法对象作为参数传递给InvocationHandler处理  
//      m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[] { Class.forName("java.lang.Object") });  
//    //加载接口中定义的方法sellTicket inquire withdraw
//      m3 = Class.forName("net.zhangwenbo.TicketService").getMethod("sellTicket", new Class[0]);  
//      m4 = Class.forName("net.zhangwenbo.TicketService").getMethod("inquire", new Class[0]); 
//      m5 = Class.forName("net.zhangwenbo.TicketService").getMethod("withdraw", new Class[0]);  
//      m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);  
//      m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);  
//      return;  
//    }  
//    catch (NoSuchMethodException localNoSuchMethodException)  
//    {  
//      throw new NoSuchMethodError(localNoSuchMethodException.getMessage());  
//    }  
//    catch (ClassNotFoundException localClassNotFoundException)  
//    {  
//      throw new NoClassDefFoundError(localClassNotFoundException.getMessage());  
//    }  
//  }  
//}  
/**
 * 车站实现售票服务接口
 */
package net.zhangwenbo;

/**
 * @author Iver3oN Zhang
 * @date 2016年4月13日
 * @email grepzwb@qq.com
 * Station.java
 * Impossible is nothing
 */
public class Station implements TicketService {

	/* (non-Javadoc)
	 * @see net.zhangwenbo.TicketService#sellTicket()
	 */
	@Override
	public void sellTicket() {
		// TODO Auto-generated method stub
		System.out.println("车站售票");
	}

	/* (non-Javadoc)
	 * @see net.zhangwenbo.TicketService#inquire()
	 */
	@Override
	public void inquire() {
		// TODO Auto-generated method stub
		System.out.println("车站咨询");
	}

	/* (non-Javadoc)
	 * @see net.zhangwenbo.TicketService#withdraw()
	 */
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("车站退票");
	}

}

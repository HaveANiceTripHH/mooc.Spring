package cn.spring.demo2;

/**
 * @author Administrator
 *	转账案例业务实现
 */
public interface AccountService {
	public void transfer(String out,String in,Double money);
}

package cn.spring.demo1;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void outMoney(String out, Double money) {
		// TODO Auto-generated method stub
		String sql="update account set money = money - ? where name = ?";
		this.getJdbcTemplate().update(sql,money,out);
	}

	@Override
	public void inMoney(String in, Double money) {
		// TODO Auto-generated method stub
		String sql="update account set money = money + ? where name = ?";
		this.getJdbcTemplate().update(sql, money,in);
	}

}

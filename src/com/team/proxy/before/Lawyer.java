package com.team.proxy.before;

import java.math.BigDecimal;

/**
 * <pre>
 * 律師
 * 實際處理各種法律相關事情的人
 * </pre>
 * 
 * @author memorykghs
 *
 */
public class Lawyer implements DivorceService {

	@Override
	public BigDecimal propertyDistribute() {
		System.out.println("帳戶只剩100塊");
		return new BigDecimal("50");
	}

	@Override
	public BigDecimal getComfortMoney() {
		System.out.println("不是事主的錯，所以不用賠");
		return BigDecimal.ZERO;
	}

	@Override
	public BigDecimal getAlimony() {
		System.out.println("沒有小孩，哪來的贍養費");
		return BigDecimal.ZERO;
	}

}

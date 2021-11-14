package com.team.proxy.after;

import java.math.BigDecimal;

/**
 * 委託給律師的代理
 * 
 * @author memorykghs
 */
public class LawyerProxy implements DivorceService {

	private Lawyer lawyer;
	
	public LawyerProxy(Lawyer lawyer) {
		this.lawyer = lawyer;
	}

	@Override
	public BigDecimal propertyDistribute() {
		System.out.println("財產分配 - 律師的答覆：");
		return lawyer.propertyDistribute();
	}

	@Override
	public BigDecimal getComfortMoney() {
		System.out.println("撫慰金 - 律師的答覆：");
		return lawyer.getComfortMoney();
	}

	@Override
	public BigDecimal getAlimony() {
		System.out.println("贍養費 - 律師的答覆：");
		return lawyer.getAlimony();
	}

}

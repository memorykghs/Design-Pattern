package com.team.proxy.before;

import java.math.BigDecimal;

/**
 * Service 定義各種家務事需求的介面
 * 
 * @author memorykghs
 *
 */
public interface DivorceService {

	/** 財產分配 */
	public BigDecimal propertyDistribute();

	/** 要慰撫金 */
	public BigDecimal getComfortMoney();

	/** 要贍養費 */
	public BigDecimal getAlimony();

}

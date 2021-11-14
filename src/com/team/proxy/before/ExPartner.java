package com.team.proxy.before;

/**
 * <pre>
 * 前配偶與討人厭的親戚
 * 就是 Client 端
 * </pre>
 * 
 * @author memorykghs
 */
public class ExPartner {
	public static void main(String[] args) {
		DivorceService service = new Lawyer();
		service.propertyDistribute();
		service.getComfortMoney();
		service.getAlimony();
	}
}

package com.team.proxy.after;

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
		DivorceService service = new LawyerProxy(new Lawyer());
		service.propertyDistribute();
		service.getComfortMoney();
		service.getAlimony();
		
//		DivorceService service = new Lawyer();
	}
}

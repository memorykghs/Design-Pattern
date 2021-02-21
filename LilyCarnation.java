package simpleFactory;

public class LilyCarnation implements Flower{

	/**
	 * 開花的同時會吃人!
	 */
	@Override
	public void bloom() {
		System.out.println("Lily carnation bloomed.");
		System.out.println("Lily carnation eats people!!!!!");
	}
	
	/**
	 * 開花的同時會吃人!
	 */
//	public void bloom() {
//		System.out.println("Lily carnation bloomed.");
//		System.out.println("Lily carnation eats people!!!!!");
//	}
}

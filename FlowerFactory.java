package simpleFactory;

public class FlowerFactory {
	public Flower plantFlower() {
		int num = (int) (Math.random() * 100) + 1;

		if (num % 2 == 1) {
			return new Carnation();
		} else {
			return new LilyCarnation();
		}
	}
}

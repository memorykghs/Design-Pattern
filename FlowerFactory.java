package simpleFactory;

public class FlowerFactory {
	public Flower plantFlower() {
		int num = (int) (Math.random() * 100) + 1;

		if (num % 3 == 1) {
            return new Carnation();
        } else if (num % 3 == 2) {
            return new LilyCarnation();
        } else { // 多了另一種康乃馨
            return new TiredLilyCarnation();
        }
	}
}

# 03 - 工廠模式 ( Factory )
## 定義
為了解決簡單工廠違反開放封閉原則的問題，針對工廠的部分也設定介面，當要產出產品時，才實例化該產品的工廠，透過工廠產生產品類別。

## 角色 & UML
* **Product ( 抽象產品 )**
是一個定義產品規格的介面 ( Interface )。

* **ConcreteProduct ( 實體產品 )**
具體產生的產品實體 ( Class )，藉由工廠角色依據介面條件而建立。

* **Factory ( 工廠 )**
定義工廠的介面。

* **ContreteFactory ( 實體工廠 )**
根據不同條件產生的工廠實例，負責根據參數建立產品類別。

## 實作說明
根據簡單工廠中的花園的例子，現在我們先將原本的 `FlowerFactory` 抽成介面。
```java
public interface FlowerFactory {
    Flower plantFlower();
}
```

再來，產生實體工廠。我們的花園現在可以種植3種不同的花，種花這件事情會交給相對的實體工廠來做，所以會有3個實體工廠 `CarnationFactory.java`、`LilyCarnationFactory.java` 以及 `TiredLilyCarnationFactory.java`。
```java
public class CarnationFactory implements FlowerFactory {

	@Override
	public factory.Flower plantFlower() {
		return new Carnation();
	}
}
```
```java
public class LilyCarnationFactory implements FlowerFactory{

    @Override
    public Flower plantFlower() {
        return new LilyCarnation();
    }
}
```
```java
public class TiredLilyCarnationFactory implements FlowerFactory{

    @Override
    public Flower plantFlower() {
        return new TiredLilyCarnation();
    }
}
```

另外附上3種花的類別與介面：
```java
public interface Flower {
    void bloom();
}
```
```java
public class Carnation implements Flower{

    /**
     * 開花
     */
    @Override
    public void bloom() {
        System.out.println("Carnation bloomed.");
    }
}
```
```java
public class LilyCarnation implements Flower{

    /**
     * 開花的同時會吃人!
     */
    @Override
    public void bloom() {
        System.out.println("Lily carnation bloomed.");
        System.out.println("Lily carnation eats people!!!!!");
    }
}
```
```java
public class TiredLilyCarnation implements Flower{

    /**
     * 沒力氣吃人...懶...
     */
    @Override
    public void bloom() {
        System.out.println("Tired Lily carnation tired to bloom.");
        System.out.println("Tired to eat people, either.");
    }
}
```

實際使用的時候會建立對應的實體工廠來產生 ( 種植 ) 我們想要的花，雖然說這樣解決的開放封閉的問題，只要有新產品需要建立，我們就會新增一個實體工廠來負責，一旦產品種類變多了，也會增加程式碼的複雜度。
```java
public class test {
    public static void main(String[] args) {
        // 新增莉莉康乃馨
        LilyCarnationFactory lilyCarnationFactory = new LilyCarnationFactory();
        LilyCarnation lilyCarnation = (LilyCarnation) lilyCarnationFactory.plantFlower();
        lilyCarnation.bloom();
		
        // 新增懶散莉莉康乃馨
        TiredLilyCarnationFactory tiredLilyCarnationFactory = new TiredLilyCarnationFactory();
        TiredLilyCarnation tiredLilyCarnation = (TiredLilyCarnation) tiredLilyCarnationFactory.plantFlower();
        tiredLilyCarnation.bloom();
    }
}
```

## 結論
在物件建構複雜度高時較推薦使用，因建立物件的過程被包裝起來，使用者不必知道建造物件的過程就可以拿到最終的產品。

###### 優點
* 透過工廠建立實例，外部使用者不需要知道如何產生實例便可以使其公開方法 &rArr; 職責分離。
* 符合開放封閉原則，新增的產品建立過程不會動到既有邏輯。
###### 缺點
* 實體工廠類別過多，易造成程式複雜度提高且不好維護。

## 參考
https://blog.amowu.com/factory-pattern/
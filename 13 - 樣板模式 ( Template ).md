# 13 - 樣板模式 ( Template )

## Template Pattern 


## UML
1. **抽象類別 Abstract­Class** 
將達成某個目的的執行過程拆成較細的方法，並規定調用他們的優先順序或關係，模板方法會依照這些特定的順序來調用這些步驟。當有重複不變的邏輯，也可以直接定義在模板方法內。

2. **實例類別 Concrete­Class** 
可以複寫所有模板類別中的步驟，但不能複寫樣板本身。
![](/images/template-1.png)

## 實際應用

## 實作
一起來做漢堡包^^。

* `Tempalte Method Class`
```java
public abstract class HambergerTemplate {
	
	final void makeHamberger() {
		
		roastBun();
		addMeat();
		
		if(doubleCheeseBerger()) {
			addCheese();
			addMeat();
		}
		addCheese();
		addVegetables();
		wrapHamberger();
	}
	
	public abstract void roastBun();
	
	public abstract void addMeat();
	
	public void addCheese() {
		System.out.println("Added cheese.");
	}
	
	public void addVegetables() {
		System.out.println("Added vegetables");
	}
	
	public void wrapHamberger() {
		System.out.println("Hamberger wrapped.");
	}
	
	public boolean doubleCheeseBerger() {
		return false;
	}
}
```
<br/>

然後建立兩種產品：雙層牛肉吉士堡、麥香魚
```java
/**
 * 雙層牛肉吉士堡
 * @author memorykghs
 */
public class DoubleCheeseBerger extends HambergerTemplate {

	String usedMeat = "beef";

	String usedBun = "rice";

	@Override
	public void roastBun() {
		System.out.println("Roast " + usedBun);
	}

	@Override
	public void addMeat() {
		System.out.println("Added " + usedMeat);
	}
	
	public void wrapHamberger() {
		System.out.println("DoubleCheeseBerger wrapped.");
	}

	public boolean doubleCheeseBerger() {
		return true;
	}
}
```

```java
/**
 * 麥香魚
 * 
 * @author memorykghs
 */
public class FiletOFishBerger extends HambergerTemplate {

	String usedMeat = "cod"; // 鱈魚

	String usedBun = "bun";

	@Override
	public void roastBun() {
		System.out.println("Roast " + usedBun);
	}

	@Override
	public void addMeat() {
		System.out.println("Added " + usedMeat);
	}

	public void wrapHamberger() {
		System.out.println("FiletOFishBerger wrapped.");
	}
}
```

最後測試。
```java
public class Client {

	public static void main(String[] args) {

		// 做雙層牛
		DoubleCheeseBerger doubleCheeseBerger = new DoubleCheeseBerger();
		doubleCheeseBerger.makeHamberger();
		
		System.out.println("==========");
		
		// 做麥香魚
		FiletOFishBerger fieFiletOFishBerger = new FiletOFishBerger();
		fieFiletOFishBerger.makeHamberger();

	}
}
```

![](/images/template-2.png)

## 小結

#### 優點


#### 缺點


## 參考
* https://refactoring.guru/design-patterns/template-method
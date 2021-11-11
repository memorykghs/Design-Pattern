# 07 - 轉接器模式 ( Adapter )

## Adapter Pattern 
大家都聽過披著羊皮的狼，狼想要混入羊群，就需要找一張羊皮披著偽裝成洋。在上述這個例子中，狼與羊是兩種完全不同、且無法放在同一個地區和平生活的動物。

![](/images/adapter-4.png)

藉由披著羊皮的狼的故事，可以知道應用轉接器模式的狀況的特點：
* 客戶端介面與當前應用程式的介面不相容 ( 狼與羊是互斥共生關係 )
* 無法修改任一方的程式碼 ( 畢竟不能把狼改造成羊 )
* 確認多一個到多個客戶端將受益於使用服務類別的方法

那麼羊皮 ( 轉接器 ) 做了什麼呢，首先它靠外表成功的偽裝成羊 ( 具有與目標對象相同的接口 )。羊群知道混入了一隻披著羊皮的狼嗎?可能不知道! ( 呼叫轉接器方法的對象很有可能不知道轉接器的存在 ) ~~因為羊群沒有想過有狼會把同伴的皮剝下來當煙霧彈~~。

講點正經的，另外一個例子是如果想要做一個監控市場股價的 APP，但股票資訊平台的 API 只提供 XML 格式的檔案，而分析用的第三方資源庫則是必須接收 JSON 格式資料。這時候就需要在應用程式中做一個轉接器，將 XML 資料轉換為 JSON 格式。
![](/images/adapter-1.png)

轉接器模式痛過封裝某個對象，將複雜的轉換過程隱藏起來。被封裝的對象甚至察覺不到轉接器的存在。除了轉換不同格式的數據外，轉接器模式還有助於不同接口的介面之間的合作，其運作方式如下：

1. 轉接器實現一個與其相容的接口，並建立實例。
    > The adapter gets an interface, compatible with one of the existing objects.

2. 透過相容的接口，目標對象就可以使用該接口調用轉接器的方法。
    > Using this interface, the existing object can safely call the adapter's methods.

3. 轉接器方法被調用後，將已與另一個對象相容的格式將請求傳遞給該對象。
    > Upon receiving a call, the adapter passes the request to the second object, but in a format and order that the second object expects.

![](/images/adapter-2.png)
<br/>

## UML
![](/images/adapter-3.png)

1. 客戶端是一個爆含當前應用程式業務邏輯的類別。
    > The Client is a class that contains the existing business logic of the program.

2. 客戶端接口規定了其他與之互動的對象必須遵循的規範。
    > The Client Interface describes a protocol that other classes must follow to be able to collaborate with the client code.

3. 應用程式中有一些功能類別 ( 通常來自第三方或是較舊的系統 ) 與客戶端的接口不相容，因此無法直接調用其功能。
    > The Service is some useful class (usually 3rd-party or legacy). The client can't use this class directly because it has an incompatible interface.

4. 轉接器是一個可以同時與客戶端和服務端作用的類別，它在實現客戶端的接口的同時，封裝了服務對象。轉接器接受客戶端發起的調用，並將其轉換為適用於被封裝對象的接口，再呼叫其方法。
    > The Adapter is a class that's able to work with both the client and the service: it implements the client interface, while wrapping the service object. The adapter receives calls from the client via the adapter interface and translates them into calls to the wrapped service object in a format it can understand.

5. 客戶端成是只需要通過接口與轉接器互動即可，不需要與具體的轉接器類別耦合。因此，可以在程式中新增新的轉接器而不需要修改原有的代碼。這在提供服務的類別接口被更改或替換時很有用，因為不需要修改到客戶端的程式碼就可以創建新的轉接器。
    > The client code doesn't get coupled to the concrete adapter class as long as it works with the adapter via the client interface. Thanks to this, you can introduce new types of adapters into the program without breaking the existing client code. This can be useful when the interface of the service class gets changed or replaced: you can just create a new adapter class without changing the client code.

## 實際應用

## 實作

## 小結
#### 優點
* 單一職責原則：將接口或數據轉換程式從應用程式的主要業務邏輯中分離。
* 開放封閉原則：只要客戶端呼叫轉接器對象的方法，就能在不修改線有客戶端程式碼的情況下，在程式中添加新的轉接器。

#### 缺點
* 程式碼整體的複雜度增加，因為需要新增轉接器的接口介面和實作類別。

![](/images/icon-question.png) Proxy Pattern 一定都要從 Client 端建立實際的服務對象傳入??? [範例](https://matthung0807.blogspot.com/2020/11/java-proxy-pattern.html)

## 參考
* https://refactoringguru.cn/design-patterns/adapter
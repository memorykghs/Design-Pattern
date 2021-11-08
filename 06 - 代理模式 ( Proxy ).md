# 06 - 代理模式 ( Proxy )

## UML
![](/images/proxy-3.png)

## Proxy Pattern
假設有一天，你的伴侶因為在外面闖禍導致你們離婚，但是你又對法律相關的問題不熟，所以就請了一個律師，委託他幫你處理這些事情…

所以當今天你的伴侶來找你吵著要 $$ 時，你把這一切委託給了律師。<br/>

![](/images/proxy-1.png)

之後如果出現各種親戚，一律通通交給律師。<br/>

![](/images/proxy-2.png)

## 實際應用
實際應用的例子，可以看看 Spring Security。在MVC架構中會使用Filter過濾進來的Request，Security在中間使用的Proxy Pattern，攔截Request並把真正要驗證的東西交給Spring中的Bean去做。
![](/images/proxy-4.png)

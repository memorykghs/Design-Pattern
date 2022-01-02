# 17 - 命令模式 ( Command )

## Command Pattern 

## UML
![](/images/command-1.png)

命令模式將請求封裝成物件，讓使用者將請求、佇列 ( Queue ) 或紀錄等物件參數畫，並支援可復原的操作 ( unexecute )。

1. Command 物件藉著將準備送給 Receiver 的一組行動綁在一起，來封裝請求。<br/>

![](/images/command-3.png)

2. Command 物件將動作和 Receiver 都包在裡面，且只公開一個方法供外部使用 ( execute )。外部不會知道哪個 Receiver 被呼叫執行，只知道呼叫 `execute()` 方法後請求會被處理。

![](/images/command-4.png)

## 實際應用

## 實作
![](/images/command-2.png)

## 小結

#### 優點


#### 缺點


## 參考
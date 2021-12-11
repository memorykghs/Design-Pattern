package com.team.iterator;

public interface Iterator {

	public boolean hasNext(); // 或是命名成 isDone 比較好，才不會有一堆 Next 在那邊!!!

	public void next(); // 移動 pointer 到下一個物件

	public Object current(); // 返回當前 pointer 指到的物件
}

package com.wahaha.bean;

public class ItemsSort implements Comparable<ItemsSort>{
	
	private String tag;
	private int value;
	
	public ItemsSort(String tag, int value) {
		super();
		this.tag = tag;
		this.value = value;
	}
	@Override
	public int compareTo(ItemsSort o) {
		int i = this.value - o.value;//先按照从小到大排序
//		if(i==0) {
//		return this.score - o.score; //如果年龄相等了再用其他项（此处以分数为例）进行排序
//	}
		return i;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

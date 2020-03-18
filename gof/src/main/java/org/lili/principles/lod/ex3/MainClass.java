package org.lili.principles.lod.ex3;

public class MainClass {
	public static void main(String[] args) {
		SomeOne zhangsan = new SomeOne();
		//SomeOne和陌生人完全解耦了，通过friend
		zhangsan.setFriend(new Friend());
		zhangsan.getFriend().playWithStranger();
	}
}

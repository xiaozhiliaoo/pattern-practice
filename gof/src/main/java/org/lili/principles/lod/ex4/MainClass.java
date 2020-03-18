package org.lili.principles.lod.ex4;

public class MainClass {
	public static void main(String[] args) {
		SomeOne zhangsan = new SomeOne();
		zhangsan.setFriend(new FriendA());
		zhangsan.setStranger(new StrangerA());
		zhangsan.play();
	}
}

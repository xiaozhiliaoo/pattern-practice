package org.lili.principles.lod.ex4;

public class SomeOne {

	private Friend friend;
	//某人和陌生人抽象类进行通信.....DIP依赖倒转   Stranger可以进行很多
	private Stranger stranger;

	public Stranger getStranger() {
		return stranger;
	}

	public void setStranger(Stranger stranger) {
		this.stranger = stranger;
	}

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public void play() {
		System.out.println("someone play");
		friend.play();
		stranger.play();
	}
}

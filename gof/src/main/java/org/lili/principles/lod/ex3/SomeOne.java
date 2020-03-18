package org.lili.principles.lod.ex3;

public class SomeOne {
	private Friend friend;
	
	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public void play(Friend friend){
		System.out.println("someone play");
		friend.play();
	}
}

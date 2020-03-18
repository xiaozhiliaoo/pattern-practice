package org.lili.principles.lod;

public class SomeOne {

	//重载方法play
	public void play(Friend friend){
		System.out.println("someone play");
		friend.play();
	}

	//不应该和陌生人打交道.......
	public void play(Stranger stranger) {
		System.out.println("someone play");
		stranger.play();
	}
}

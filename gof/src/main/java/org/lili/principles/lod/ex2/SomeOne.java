package org.lili.principles.lod.ex2;

public class SomeOne {


	public void play(Friend friend){
		System.out.println("someone play");
		friend.play();
		//通过friend转发调用  不符合迪米特法则
		Stranger stranger = friend.getStranger();
		stranger.play();
	}
}

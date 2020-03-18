package org.lili.principles.lod.ex3;

public class Friend {
	public void play(){
		System.out.println("friends paly");
	}

	//此时候才符合了迪米特法则了.....
	public void playWithStranger() {
		Stranger stranger = new Stranger();
		stranger.play();
	}
}

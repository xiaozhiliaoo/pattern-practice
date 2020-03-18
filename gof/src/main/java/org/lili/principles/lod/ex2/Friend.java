package org.lili.principles.lod.ex2;

public class Friend {
	public void play(){
		System.out.println("friends paly");
	}
	
	public Stranger getStranger() {
		return new Stranger();
	}
}

package org.lili.principles.lod;

public class MainClass {
	public static void main(String[] args) {
		SomeOne zhangsan = new SomeOne();
		zhangsan.play(new Friend());
		zhangsan.play(new Stranger());
	}
}

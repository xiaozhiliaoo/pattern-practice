package org.lili.principles.lod.ex2;

public class MainClass {
	public static void main(String[] args) {
		SomeOne zhangsan = new SomeOne();
		//通过第三者转发调用
		zhangsan.play(new Friend());
	}
}

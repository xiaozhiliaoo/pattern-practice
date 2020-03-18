package org.lili.structural.flyweight.ex1;

public class MainClass {

	public static void main(String[] args) {
		//传统  对于客户端来说  a ，a  是一个东西，但是引用地址不同。享元使得其共享对象。
		MyCharacter myChar1 = new MyCharacter('a');
		MyCharacter myChar2 = new MyCharacter('b');
		MyCharacter myChar3 = new MyCharacter('a');
		MyCharacter myChar4 = new MyCharacter('d');

		myChar1.display();
		myChar2.display();
		myChar3.display();
		myChar4.display();

		if(myChar1 == myChar3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		//MyCharacter工厂  享元模式
		MyCharacterFactory factory = new MyCharacterFactory();
		MyCharacter myChar11 = factory.getMyCharacter('a');
		MyCharacter myChar22 = factory.getMyCharacter('b');
		MyCharacter myChar33 = factory.getMyCharacter('a');
		MyCharacter myChar44 = factory.getMyCharacter('d');
		
		myChar11.display();
		myChar22.display();
		myChar33.display();
		myChar44.display();
		
		if(myChar11 == myChar33) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}

package org.lili.creational.factorymethod.ex1;

public class MainClass {
	public static void main(String[] args) {


		//工厂创建对象有三种工厂 ：1 简单工厂【静态工厂】 2 多态工厂 3 抽象工厂
		//多态工厂-工厂方法
		//Often, designs start out using Factory Method
		// (less complicated, more customizable, subclasses proliferate)
		// and evolve toward Abstract Factory, Prototype, or Builder
		// (more flexible, more complex) as the designer discovers where
		// more flexibility is needed.
		//简单工厂模式工厂是一个具体的工厂，而工厂方法是一个抽象工厂类
		FruitFactory ff = new AppleFactory();
		Fruit apple = ff.getFruit();
		apple.get();

		FruitFactory ff2 = new BananaFactory();
		Fruit banana = ff2.getFruit();
		banana.get();
		

		FruitFactory ff3 = new PearFactory();
		Fruit pear = ff3.getFruit();
		pear.get();

		//这里如果在新增一个Orange，需要增加Orange和OrangeFactory....但是明显的会造成大量工厂类和产品类
		//但是符合了开闭原则【OCP】
	}
}

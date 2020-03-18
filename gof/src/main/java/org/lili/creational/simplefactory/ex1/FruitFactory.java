package org.lili.creational.simplefactory.ex1;


public class FruitFactory {
	//	/*
//	 * 获得Apple类的实例
//	 */
//	public static  Fruit getApple() {
//		return new Apple();
//	}
//
//	/*
//	 * 获得Banana类实例
//	 */
//	public static Fruit getBanana() {
//		return new Banana();
//	}
	/*
	 * get方法，获得所有产品对象
	 */
	public static Fruit getFruit(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//新加产品的话破坏了开闭原则
//		if(type.equalsIgnoreCase("apple")) {
//			return Apple.class.newInstance();
//
//		} else if(type.equalsIgnoreCase("banana")) {
//			return Banana.class.newInstance();
//		} else {
//			System.out.println("找不到相应的实例化类");
//			return null;
//		}

		/*if(type.equalsIgnoreCase("apple")){
			return new Apple();
		}else if(type.equalsIgnoreCase("banana")){
			return new Banana();
		}else{
			System.out.println("找不到相应的实例化类");
			return null;
		}*/

		//要是在不同的包下面，这里不好处理了。
		Class fruit = Class.forName("org.lili.creational.simplefactory.ex1."+type);
		return (Fruit) fruit.newInstance();
	}
}

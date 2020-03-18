package org.lili.structural.adapter.ex1;

/**
 * Adaptee
 */
public class Current {
	/**
	 * 修改一个后，大量客户端代码重写
	 * 设计模式为了变化，为了soild原则而设计的.....
	 * 适配器模式说明前期设计不规范。
	 */
	public void use220V() {
		System.out.println("使用220V电流");
	}
}

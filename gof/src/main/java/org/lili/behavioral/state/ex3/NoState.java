package org.lili.behavioral.state.ex3;

public class NoState extends State {

	public void doSomething(Person person) {
		System.out.println(person.getHour() +  "无状态");
	}
}

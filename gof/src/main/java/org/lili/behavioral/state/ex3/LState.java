package org.lili.behavioral.state.ex3;

public class LState extends State{

	public void doSomething(Person person) {
		if(person.getHour() == 12) {
			System.out.println("吃午饭.....");
		} else {
			person.setState(new SState());
			//实现了状态转移
			person.doSomething();
		}
	}
}

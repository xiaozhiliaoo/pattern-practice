package org.lili.behavioral.state.ex3;

public class MState extends State {

	public void doSomething(Person person) {
		if(person.getHour() == 7) {
			System.out.println("吃早饭....");
		} else {
			person.setState(new LState());
			//必须有doSomething.....
			person.doSomething();
		}
	}

}

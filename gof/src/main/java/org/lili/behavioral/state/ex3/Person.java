package org.lili.behavioral.state.ex3;

public class Person {

	//Refacotr：  Replace Type Code with State/Strategy
	private int hour;

	private State state;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public Person() {
		//实例化状态
		state = new MState();
	}

	/**
	 * 不同状态不同行为.....
	 */
	public void doSomething(){
//		if(hour == 7) {
//			state = new MState();
//			state.doSomething();
//		} else if(hour == 12) {
//			state = new LState();
//			state.doSomething();
//		} else if(hour == 18) {
//			state = new SState();
//			state.doSomething();
//		} else {
//			state = new NoState();
//			state.doSomething();
//		}
		//判断逻辑转移到state里面
		state.doSomething(this);
		//进行状态复位  也可以在NoState进行复位
		state = new MState();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}

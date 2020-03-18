package org.lili.behavioral.observer.ex3;



//Subject  核心是容器。观察其他对象变化。被观察对象放在容器，通知本质容器对象拿出来，一个一个调用方法
public class PersonSubject extends MyObservable {
	private String name;
	private String sex;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
		this.setChanged();
		//调用Observer所有方法
		this.notifyObservers();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.setChanged();
		this.notifyObservers();
		this.age = age;
	}

}

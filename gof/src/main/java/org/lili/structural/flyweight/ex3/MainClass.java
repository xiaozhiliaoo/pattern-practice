package org.lili.structural.flyweight.ex3;

public class MainClass {
	public static void main(String[] args) {
		//构造老师的工厂创建过程必须在factory里面配置好
		TeacherFactory factory = new TeacherFactory();
		Teacher teacher1 = factory.getTeacher("0102034");
		Teacher teacher2 = factory.getTeacher("0102035");
		Teacher teacher3 = factory.getTeacher("0102034");
		Teacher teacher4 = factory.getTeacher("0102037");
		
		System.out.println(teacher1.getNumber()+"---"+teacher1.getName());
		System.out.println(teacher2.getNumber());
		System.out.println(teacher3.getNumber());
		System.out.println(teacher4.getNumber());

		//引用相同，做到了共享数据
		if(teacher1 == teacher3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}

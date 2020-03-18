package org.lili.creational.builder.ex1;

public class MainClass {

	public static void main(String[] args) {
//		//客户直接造房子
//		House house = new House();
//		house.setFloor("地板");
//		house.setWall("墙");
//		house.setHousetop("屋顶");


		//由工程队来修    隐藏构造细节  此处可以通过反射动态配置，无需修改代码了
		//对于client 代码越来越简单
		HouseBuilder builder = new GongyuBuilder();
		//设计者来做
		HouseDirector director = new HouseDirector();
		//创建房子
		House house = director.makeHouse(builder);
		//这里感觉不连续
//		House house = builder.getHouse();

		System.out.println(house.getFloor());
		System.out.println(house.getWall());
		System.out.println(house.getHousetop());
	}

}

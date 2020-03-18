package org.lili.behavioral.strategy.ex5;

/**
 * Created by lili on 2017/7/8.
 */
/* Using the Car example */
public class CarExample {
    public static void main(final String[] arguments) {
        System.out.println("静态的改变行为.......");
        Car sedanCar = new Sedan();//轿车
        sedanCar.applyBrake();  // This will invoke class "Brake"  制动

        Car suvCar = new SUV();//多功能车
        suvCar.applyBrake();    // This will invoke class "BrakeWithABS" //ABS制动


        System.out.println("动态的改变行为........");
        // set brake behavior dynamically
        suvCar.setBrakeBehavior(new Brake());
        suvCar.applyBrake();    // This will invoke class "Brake"
        suvCar.setBrakeBehavior(new BrakeWithABS());
        suvCar.applyBrake();
    }
}

package registry.sole;

/**
 * @packgeName: org.lili.chapter18.registry
 * @ClassName: MainClass
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/9/3-23:48
 * @version: 1.0
 * @since: JDK 1.8
 */
public class MainClass {
    public static void main(String[] args) {

        Person person = Registry.personFinder().find(1);
        System.out.println(person);
        Registry.initialize();

    }
}

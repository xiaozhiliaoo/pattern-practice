package registry.thread;

import org.junit.Assert;
import org.lili.chapter18.registry.sole.Person;
import org.lili.chapter18.registry.sole.PersonFinder;
import org.lili.chapter18.registry.sole.Registry;

/**
 * @packgeName: org.lili.chapter18.registry.thread
 * @ClassName: MainClass
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/9/4-0:15
 * @version: 1.0
 * @since: JDK 1.8
 */
public class MainClass {
    public static void main(String[] args) {
        try {
            //begin 和 end 间 就是使用注册表全过程
            ThreadLocalRegistry.begin();
            PersonFinder personFinder = ThreadLocalRegistry.personFinder();
            Person martin = Registry.personFinder().find(1);
            Assert.assertTrue("Fowler" == martin.getLastName());
        } finally {
            ThreadLocalRegistry.end();
        }
    }
}

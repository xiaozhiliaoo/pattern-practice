package registry.thread;

import org.junit.Assert;
import org.lili.chapter18.registry.sole.PersonFinder;

/**
 * @packgeName: org.lili.chapter18.registry.thread
 * @ClassName: ThreadLocalRegistry
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/9/4-0:08
 * @version: 1.0
 * @since: JDK 1.8
 */
public class ThreadLocalRegistry {

    private static ThreadLocal instances = new ThreadLocal();

    public static ThreadLocalRegistry getInstance(){
        return ((ThreadLocalRegistry) instances.get());
    }

    public static void begin(){
        Assert.assertTrue(instances.get() == null);
        instances.set(new ThreadLocalRegistry());
    }

    public static void end(){
        Assert.assertTrue(getInstance() != null);
        instances.set(null);
    }

    private PersonFinder personFinder = new PersonFinder();

    public static PersonFinder personFinder(){
        return getInstance().personFinder;
    }
}

package registry.sole;

/**
 * @packgeName: org.lili.chapter18.registry
 * @ClassName: RegistryStub
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/9/3-23:09
 * @version: 1.0
 * @since: JDK 1.8
 */
public class RegistryStub extends Registry {



    public RegistryStub(){
        personFinder = new PersonFinderStub();
    }

}

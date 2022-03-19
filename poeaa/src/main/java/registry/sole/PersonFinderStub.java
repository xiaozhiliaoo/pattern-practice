package registry.sole;

/**
 * @packgeName: org.lili.chapter18.registry
 * @ClassName: PersonFinderStub
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/9/3-23:10
 * @version: 1.0
 * @since: JDK 1.8
 */
public class PersonFinderStub extends PersonFinder {

    public Person find(long id){
        if(id==1){
            return new Person("Fowler","Martin",10);
        }
        throw new IllegalArgumentException("Can not find id: "+ String.valueOf(id));
    }
}

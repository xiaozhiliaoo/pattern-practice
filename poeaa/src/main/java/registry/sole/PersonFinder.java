package registry.sole;

/**
 * @packgeName: org.lili.chapter18.registry
 * @ClassName: PersonFinder
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/9/3-23:07
 * @version: 1.0
 * @since: JDK 1.8
 */

/**
 * Person查找器
 */
public class PersonFinder {

    public Person find(long id){

        if(id==1){
            return new Person("Martin","Fowler",10);
        }
        throw new IllegalArgumentException("Can not find id: "+ String.valueOf(id));
    }
}

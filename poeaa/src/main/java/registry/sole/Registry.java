package registry.sole;

/**
 * @packgeName: org.lili.chapter18.registry
 * @ClassName: Registry
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/9/3-23:05
 * @version: 1.0
 * @since: JDK 1.8
 */
public class Registry {

//    public  int a = 5;



    private static Registry getInstance(){

        return soleInstance;
    }

//    private Registry(){};

    private static Registry soleInstance = new Registry();

    //查找器是实例，注册表是静态
    protected PersonFinder personFinder = new PersonFinder();

    public static PersonFinder personFinder(){
        return getInstance().personFinder;
    }

    /**
     * 重新初始化注册表
     */
    public static void initialize(){
        soleInstance = new Registry();
    }

    public static void initializeStub(){
        soleInstance = new RegistryStub();
    }


    public static void main(String[] args) {
//        Registry.a;
        //类内可以访问私有私有静态属性以及方法,其他类访问不了
        Registry instance = Registry.getInstance();
        Registry soleInstance = Registry.soleInstance;
        instance.personFinder.find(1);
        System.out.println(instance);
//        initialize();
        //通过注册表查找对象，此时系统并没有Person的引用
        Person p = Registry.personFinder().find(1);
        System.out.println(p);

    }
}

package registry.sole;

/**
 * @packgeName: org.lili.chapter18.registry
 * @ClassName: CreateInstanceCount
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/9/3-23:59
 * @version: 1.0
 * @since: JDK 1.8
 */
public class CreateInstanceCount {


    private static final int k = 0;
    private static int i = 0;
    private int j = 0;


    public void incre(){
        i++;
        j++;
    }


    @Override
    public String toString() {
        return "对象被创建" + i + "次---" + j+"次";
    }

    public static void main(String[] args) {
        new CreateInstanceCount().incre();
        new CreateInstanceCount().incre();
        new CreateInstanceCount().incre();
        new CreateInstanceCount().incre();
        System.out.println(new CreateInstanceCount());
    }
}

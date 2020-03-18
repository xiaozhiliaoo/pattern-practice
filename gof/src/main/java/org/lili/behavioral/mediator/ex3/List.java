package org.lili.behavioral.mediator.ex3;

/**
 * Created by lili on 2017/7/23
 */
public class List extends Component {
    public void update() {
        System.out.println("列表增加选项：张无忌");
    }

    public void select(){
        System.out.println("列表选中项：小龙女");
    }
}

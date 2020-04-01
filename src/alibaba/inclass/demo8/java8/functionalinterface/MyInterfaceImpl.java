package alibaba.inclass.demo8.java8.functionalinterface;

/**
 * @program: Java workspace
 * @description: 实现函数式接口的实现类
 * @author: typhoon
 * @create: 2020-04-01 09:16
 * 谁终将声震人间，必长久深自缄默;谁终将点燃闪电，必长久如云漂泊
 **/

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void method() {
        System.out.println("这是重写的方法");
    }
}

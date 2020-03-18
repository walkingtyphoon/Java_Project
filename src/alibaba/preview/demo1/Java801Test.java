package alibaba.preview.demo1;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/**
 * @program: Java workspace
 * @description: 练习Java8的新特性
 * @author: Typhoon
 * @create: 2020-03-06 16:29
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Java801Test {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("hello lambda");
        // 通过lambda表达式快捷实现run方法的调用
        Consumer<String> consumer= (x) -> System.out.println("args");
        // 带有参数的lambda表达式
        Consumer<String> consumer1 = x -> System.out.println("省略括号");
        // 参数可以忽略括号
        runnable.run();
        // 调用线程的执行方法
        BinaryOperator<Long> binaryOperator = (x,y) -> x + y;
    }
    public void show(){
        System.out.println("这是Runnable线程");
    }
}

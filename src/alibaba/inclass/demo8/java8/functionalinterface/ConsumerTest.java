package alibaba.inclass.demo8.java8.functionalinterface;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * @program: Java workspace
 * @description: 练习Consumer
 * @author: typhoon
 * @create: 2020-04-01 11:41
 * 谁终将声震人间，必长久深自缄默;谁终将点燃闪电，必长久如云漂泊
 **/

public class ConsumerTest {

    @Test
    public void consumerTest1(){
        method("哈尼克孜",name -> System.out.println("name = " + name));
    }

    public static void method(String name, Consumer<String> consumer){
     consumer.accept(name);
    }
}

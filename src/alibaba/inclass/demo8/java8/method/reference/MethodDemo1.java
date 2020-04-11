package alibaba.inclass.demo8.java8.method.reference;

import alibaba.inclass.demo8.java8.lambda.Person;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @program: Java workspace
 * @description: 练习方法的引用一
 * @author: typhoon
 * @create: 2020-04-06 10:41
 * 谁终将声震人间，必长久深自缄默;谁终将点燃闪电，必长久如云漂泊
 **/

public class MethodDemo1 {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println("str = " + str);
        // 实现consumer接口
        consumer.accept("迪丽热巴");
        // 传递参数
        Consumer<String> consumer1 = System.out::print;
        // 测试方法的引用
        consumer1.accept("古力娜扎");


        Person person = new Person();

        Supplier<String> supplier = () -> person.getName();

        String name = supplier.get();

        System.out.println("name = " + name);

        Supplier<Integer> supplier1 = person::getAge;

        int age = supplier1.get();

        System.out.println("age = " + age);



        Comparator<Integer> comparator = (x,y) -> Integer.compare(x,y);

        Comparator<Integer> comparator1 = Integer::compareTo;
    }
}

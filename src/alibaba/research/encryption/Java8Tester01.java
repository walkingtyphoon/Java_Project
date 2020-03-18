package alibaba.research.encryption;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @program: Java workspace
 * @description: 练习Java8新特性
 * @author: Typhoon
 * @create: 2020-02-28 12:24
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Java8Tester01{
    public static void main(String[] args) {
        List<String> names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");
        names.forEach(Person::person);
        Person person = new Person();
    }
}
class Person{
    static String name = "特特";
    int id;

    public static void person(String s) {
        System.out.println("name是："+name);
    }
}

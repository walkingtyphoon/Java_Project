package alibaba.inclass.demo6;

import alibaba.research.demo1.domain.Person;

import java.lang.reflect.Field;

/**
 * @program: Java workspace
 * @description: 练习操作成员变量的值
 * @author: Typhoon
 * @create: 2020-03-11 10:01
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Reflect03 {
    public static void main(String[] args) throws Exception {
        Class<Person> aclass = Person.class;
        // 反射创建对象
        Field value1 = aclass.getField("value1");
        // 获取成员变量
        Person person = new Person();
        // 创建类对象
        value1.set(person,"Linux");
        // 设置对象的值
        Object o = value1.get(person);
        // 获取对象属性的值
        System.out.println(o);


        Field value3 = aclass.getDeclaredField("value3");
        //  获取指定变量，不考虑修饰符
        value3.setAccessible(true);
        // 进行暴力反射，否则无法操作指定的值
        value3.set(person,"大数据");
        // 设置private的属性值
        Object o1 = value3.get(person);
        // 获取属性的值
        System.out.println(o1);
    }
}

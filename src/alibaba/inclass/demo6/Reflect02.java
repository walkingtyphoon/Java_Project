package alibaba.inclass.demo6;

import alibaba.research.demo1.domain.Person;

import java.lang.reflect.Field;

/**
 * @program: Java workspace
 * @description: 获取所有的成员方法
 * @author: Typhoon
 * @create: 2020-03-11 09:32
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Reflect02 {
    public static void main(String[] args) {
        Class<Person> class1 = Person.class;
        // 使用反射机制获取类对象
        Field[] fields = class1.getFields();
        // 获取所有的成员变量
        for (Field f:fields) {
            System.out.println(f);
            // 遍历获取到的方法
        }
        Field value2;
        try {
            value2 = class1.getField("value1");
            // 获取指定的成员方法
            System.out.println(value2);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


        Field[] declaredFields = class1.getDeclaredFields();
        // 获取所有成员变量
        System.out.println("获取所有成员变量");
        for (Field f:declaredFields) {
            System.out.println(f);
        }

        Field value1;
        try {
            value1 = class1.getDeclaredField("value2");
            // 获取指定的变量，不考虑修饰符
            System.out.println(value1);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}

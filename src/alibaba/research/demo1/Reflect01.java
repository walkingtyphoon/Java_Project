package alibaba.research.demo1;

import alibaba.research.demo1.domain.Person;

/**
 * @program: Java workspace
 * @description: 学习反射机制
 * @author: Typhoon
 * @create: 2020-03-07 11:15
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 * 反射的方式：
 * 1、通过Class.forName("全类名")
 * 2、类名.class 通过类名的属性class获取
 * 3、对象.getClass:getClass方法在object类中定义
 **/
public class Reflect01 {
    public static void main(String[] args) {
        try {
            Class aClass1 = Class.forName("alibaba.research.demo1.domain.Person");
            // 通过反射加载其中参数为类全名
            System.out.println(aClass1);
            // 第二种方式，使用类名
            Class  aClass2 = Person.class;
            System.out.println(aClass2);
            // 测试第三种方式
            Person person = new Person();
            Class aClass3 = person.getClass();
            System.out.println(aClass3);
            System.out.println(aClass1==aClass2);
            System.out.println(aClass2.equals(aClass1));
            System.out.println(aClass1==aClass3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






















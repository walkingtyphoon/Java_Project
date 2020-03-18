package alibaba.inclass.demo6;

import alibaba.research.demo1.domain.Person;

/**
 * @program: Java workspace
 * @description: 课堂学习Java反射
 * @author: Typhoon
 * @create: 2020-03-11 08:35
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Reflect01 {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("alibaba.inclass.demo6.Emp");
            System.out.println(aClass);
            Class<Person> personClass = Person.class;
            System.out.println("这是第二种方式："+personClass);

            Person person = new Person();
            Class<?> aClass1 = person.getClass();
            System.out.println(aClass1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package alibaba.inclass.demo6;

import alibaba.research.demo1.domain.Person;

import java.lang.reflect.Constructor;

/**
 * @program: Java workspace
 * @description: 获取构造方法
 * @author: Typhoon
 * @create: 2020-03-11 10:38
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Reflect04 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<?> [] constructors = personClass.getConstructors();
        // 获取所有的公共构造方法
        for (Constructor<?> constructor:constructors) {
            System.out.println(constructor);
        }

        Constructor<Person> constructor = personClass.getConstructor(int.class,String.class);
        // 获取指定的构造方法，后边参数为类型.class
        System.out.println("获取到的指定类型的构造方法为:"+constructor);

        Person person = personClass.newInstance();
        // 创建无参数的构造方法
        System.out.println(person);

        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(int.class, String.class);
        // 获取指定构造方法
        Person person1 = declaredConstructor.newInstance(10, "大数据");
        // 创建有参数构造方法
        System.out.println(person1);

        Constructor<Person> constructor1 = personClass.getDeclaredConstructor(int.class);
        // 创建私有构造方法
        constructor1.setAccessible(true);
        // 进行暴力反射
        Person person2 = constructor1.newInstance(15);
        // 创建私有的构造方法
        System.out.println(person2);
    }
}

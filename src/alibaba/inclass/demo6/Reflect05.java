package alibaba.inclass.demo6;

import alibaba.research.demo1.domain.Person;

import java.lang.reflect.Method;

/**
 * @program: Java workspace
 * @description: 获取成员方法
 * @author: Typhoon
 * @create: 2020-03-11 11:32
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Reflect05 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass =Person.class;
        // 实例化反射对象
        Method[] methods = personClass.getMethods();
        // 获取所有的公共方法，包括继承别人的方法，例如object中的tostring();
        for (Method method:methods) {
            System.out.println(method);
        }
        Method eat = personClass.getMethod("eat");
        // 获取指定的公共方法
        System.out.println(eat);


        System.out.println("-----------------------");
        Method[] declaredMethods = personClass.getDeclaredMethods();
        // 获取所有的方法,所有的方法包括私有，但是不能包含继承的方法
        for (Method method:declaredMethods) {
            System.out.println(method);
        }
        Method eat1 = personClass.getDeclaredMethod("eat",String.class);
        // 获取指定的方法,此处的参数用于区别方法，进行判断调用
        System.out.println("获取私有方法："+eat1);

        System.out.println("调用方法");
        Person person =new Person();
        // 实例化类对象
        System.out.println("此处调用私有方法");
        eat1.setAccessible(true);
        // 调用私有方法，进行暴力反射
        eat1.invoke(person,"大猪蹄子");
        // 此处的值为方法的参数
        System.out.println("获取方法的名字："+eat1.getName());
        System.out.println("获取类的名称："+personClass.getName());
    }
}

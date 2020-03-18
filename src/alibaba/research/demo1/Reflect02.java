package alibaba.research.demo1;

import alibaba.research.demo1.domain.Person;

import java.lang.reflect.Field;
import java.sql.SQLOutput;

/**
 * @program: Java workspace
 * @description: 练习反射机制获取方法
 * @author: Typhoon
 * @create: 2020-03-07 15:43
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Reflect02 {
    public static void main(String[] args) {
        Class personClass  = Person.class;
        // 获取person的对象
        Field[] fields = personClass.getFields();
        for (Field field:fields){
            System.out.println(field);
        }
        Field value1 = null;
        try {
            value1 = personClass.getField("value1");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println(value1);
    }
}

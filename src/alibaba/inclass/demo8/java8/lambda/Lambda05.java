package alibaba.inclass.demo8.java8.lambda;

import java.util.Arrays;

/*
 * @program: Java workspace
 * @description: 练习题解题
 * @author: walki
 * @create: 2020-03-25 10:43
 *     谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Lambda05 {

  /**.
   * @param args 测试的主方法
   */
  public static void main(String[] args) {
    Person [] arr = {new Person("古力娜扎",28),new Person("迪丽热巴",21),new Person("哈尼克孜",18)};
    // 创建对应的数组
    Arrays.sort(arr, (Person a, Person b) -> a.getAge() - b.getAge());
    // 使用lambda表达式进行排序
    System.out.println(Arrays.toString(arr));
    //输出数组对象
  }
}

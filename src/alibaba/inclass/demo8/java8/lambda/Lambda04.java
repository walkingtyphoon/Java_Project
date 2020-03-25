package alibaba.inclass.demo8.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;

/*
 * @program: Java workspace
 * @description: 练习二
 * @author: walki
 * @create: 2020-03-25 09:57
 *     谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Lambda04 {

  /**.
   * @param args 主方法的参数
   */
  public static void main(String[] args) {
    Person [] arr = {new Person("古力娜扎",28),new Person("迪丽热巴",21),new Person("哈尼克孜",18)};
    System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    Comparator<Person> comparator = new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
      }
    };

    // 排序
    Arrays.sort(arr,comparator);
    // 第一个参数为排序的数组，第二个为排序规则
    Arrays.sort(arr, (a, b) -> a.getAge() - b.getAge());

    System.out.println(Arrays.toString(arr));
  }
}

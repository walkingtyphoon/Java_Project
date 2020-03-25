package alibaba.inclass.demo8.java8.lambda;

/*
 * @program: Java workspace
 * @description: 练习课程练习题
 * @author: walki
 * @create: 2020-03-25 09:33
 *     谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Lambda0301 {
  /**.
   *
   * @param args Java的元数据
   */
  public static void main(String[] args) {
    invokeCook(() -> System.out.println("吃饭了"));
  }

  public static void invokeCook(Cook cook) {
    cook.makeFood();
  }
}
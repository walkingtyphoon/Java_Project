package alibaba.inclass.demo8.java8.lambda;

/*
 * @program: Java workspace
 * @description: 吃饭的优化
 * @author: walki
 * @create: 2020-03-25 11:25
 *     谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Lambda0302 {

  /**.
   * @param args 方法的参数
   */
  public static void main(String[] args) {
    invokeCook("方便面", a -> a);
    // 第一个a为参数的值,第二个值为方法体的值，也就是前边的参数
  }

  private static void invokeCook(String foodName,CookFood cookFood) {
    String food = cookFood.makeCook(foodName);
    System.out.println("今天中午吃 = " + food);
  }
}

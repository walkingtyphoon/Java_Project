package alibaba.inclass.demo8.java8.lambda;

/*
 * @program: Java workspace
 * @description: 练习题三
 * @author: walki
 * @create: 2020-03-25 10:51
 *     谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Lambda06 {

  /**.
   *
   * @param args 主方法的参数
   */
  public static void main(String[] args) {
    invokeCalc(120,130,(a,b) -> a+b);
  }

  private static void invokeCalc(int a,int b,Calculator calculator) {
    int result = calculator.calc(a,b);
    System.out.println("result = " + result);
  }
}

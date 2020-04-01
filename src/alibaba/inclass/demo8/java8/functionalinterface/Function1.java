package alibaba.inclass.demo8.java8.functionalinterface;

/**.
 * @program: Java workspace
 * @description: 学习函数式接口
 * @author: Administrator
 * @create: 2020-03-27 21:23
 *     谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Function1 {

  /**.
   * 主方法
   * @param args 主方法的参数
   */
  public static void main(String[] args) {
    show(()-> System.out.println("这是使用lambda表达式调用的方法"));
    // 使用lambda表达式调用方法
    show(new MyInterfaceImpl());
    // 作为参数传递
  }

  /**.
   * @param myInterface 这是函数式接口
   */
  static void show(MyInterface myInterface){
    myInterface.method();
  }
}

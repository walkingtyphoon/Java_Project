package alibaba.inclass.demo8.java8.lambda;

/*
 * @program: Java workspace
 * @description: 使用lambda表达式创建线程
 * @author: walki
 * @create: 2020-03-25 09:04
 *     谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Lambda03 {
  /**.
   *
   * @param args 主方法的参数
   */
  public static void main(String[] args) {
    // 简化代码
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().getName() + " 新线程创建成功 ");
      }
    }).start();


    /*
     *() 为run方法的省略
     */
    new Thread(() -> {
      System.out.println(Thread.currentThread().getName() + " 新线程创建成功 ");
    }).start();
  }
}

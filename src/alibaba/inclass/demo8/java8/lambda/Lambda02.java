package alibaba.inclass.demo8.java8.lambda;

/**
 * @program: Java workspace
 * @description: 使用Runnable实现接口
 * @author: walki
 * @create: 2020-03-25 08:40
 *      谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Lambda02 {
  /**.
   * 实现线程
   * @param args 主方法的参数
   */
  public static void main(String[] args) {
    Lambda01 lambda01 = new Lambda01();
    // 实现类对象
    Thread thread = new Thread(lambda01);
    // 实现线程传递
    thread.start();
    // 启动线程


    // 简化代码，使用匿名内部类
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().getName() + " 新线程创建成功 ");
      }
    };
    new Thread(runnable).start();


    // 简化代码
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().getName() + " 新线程创建成功 ");
      }
    }).start();
  }
}

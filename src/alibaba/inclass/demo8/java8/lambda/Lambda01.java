package alibaba.inclass.demo8.java8.lambda;

/*
 * @program: Java workspace
 * @description: 初学lambda表达式-Runnable 实现类
 * @author: walki
 * @create: 2020-03-25 08:28
 *     谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Lambda01 implements Runnable {
  public static void main(String[] args) {

  }

  @Override
  public void run() {
    System.out.println(" 新线程创建成功 "+Thread.currentThread().getName());
  }
}

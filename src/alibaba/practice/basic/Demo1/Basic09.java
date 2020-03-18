package alibaba.practice.basic.Demo1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: Java workspace
 * @description: 编写一个 Java 程序实现多线程，在线程中输出线程的名字，隔 300 毫秒输出一次，共 输出 20 次。
 * @author: Typhoon
 * @create: 2020-02-05 13:46
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic09 extends Thread{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Basic09 basic09 = new Basic09();
        executorService.submit(basic09);
        executorService.submit(basic09);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("当前线程的名字："+getName());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

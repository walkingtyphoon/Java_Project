package alibaba.practice.basic.Demo4;

import java.util.Scanner;

/**
 * @alibaba.practice
 * @TestThreadSleep.java
 * @author walki
 * @2019年11月28日
 */
public class Basic34 extends Thread{
	public static void main(String[] args) {
		TestSleep test=new TestSleep();
		Thread t=new Thread(test,"testsleep");
		t.start();
	}
}
class TestSleep implements Runnable{

	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		// 设置重写run方法
		int password=591947;
		int pass = 0;
		int end = 100;
		for (int i = 0; i < end; i++) {
			System.out.println("请输入你的密码");
			pass = sc.nextInt();
			System.out.println("正在校验信息");
			if (pass!=password) {
				System.out.println("密码错误");
			}else{
				System.out.println("登陆成功");
				System.exit(0);
			}
		}
		sc.close();
	}

}

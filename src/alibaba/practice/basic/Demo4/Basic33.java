package alibaba.practice.basic.Demo4;

/**
 * 写两个线程，一个线程打印1-52，另一个线程打印A-Z；
 * 打印顺序为：12A34B56C…5152Z
 * @alibaba.practice
 * @TestStringThread.java
 * @author walki
 * @2019年11月28日
 */
public class Basic33 {
	public static void main(String[] args) {
		TestString ts=new TestString();
		TestNumbers tm=new TestNumbers();
		Thread t1=new Thread(ts,"Str");
		Thread t2=new Thread(tm,"Str");
		t1.start();
		t2.start();
	}
}
class TestString implements Runnable{
	String [] str={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	@Override
	public void run() {
		for (String string : str) {
			System.out.println(string);
		}
	}
}
class TestNumbers implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println(i);
			if (i%2==0) {
				try {
					new Thread();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
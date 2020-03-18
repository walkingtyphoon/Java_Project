package alibaba.practice.basic.Demo3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author typhoon
 */
public class Basic25 {

	public static void main(String[] args) {
		Date date01=new Date();
		DateFormat d=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			System.out.println("现在是"+d.format(date01)+"，线程准备进入睡眠...");
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			System.out.println("代码出现问题，请调试");
			e.printStackTrace();
		}
		Date date02 =new Date();
		System.out.println("现在是"+d.format(date02)+"，线程苏醒...");
		System.out.println(date01.before(date02));
	}
}

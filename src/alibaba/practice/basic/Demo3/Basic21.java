package alibaba.practice.basic.Demo3;

import java.util.Date;

/**
 * @author walki
 */
public class Basic21 {
	public static void main(String[] args) {
		userDateForMatForMatDate();
	}

	@SuppressWarnings("unused")
	private static void testDate() {
		// 初始化Date对象
		Date date = new Date();
		// 输出当前时间
		System.out.println(date);
	}
	private static void userDateForMatForMatDate() {
		Date d=new Date();
		// 创建DateForMat的子类对象SimpleDateForMat格式化日期格式
		System.out.printf("当前的时间为：%tF",d);
		// 输出最后的测试信息
	}
}

package alibaba.practice.basic.Demo2;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 * 7009
 * 作业：根据每人的出生日期计算出生了多少天？
	  要求：
		使用Scanner获取指定格式的出生日期Dateformat
		转化为Date，使用Date计算出生天数
 * @author walki
 */
public class Basic20 {
	public static void main(String[] args) throws ParseException {
		DateFormat d=new SimpleDateFormat("yyyy-MM-dd");
		Scanner sc=new Scanner(System.in);
		Date a=d.parse(sc.next());
		Date b=new GregorianCalendar().getTime();
		long c=b.getTime()-a.getTime();
		System.out.println(c/1000/60/60/24);
		sc.close();
	}
	
}

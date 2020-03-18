package alibaba.practice.basic.Demo2;

import java.util.Scanner;

/**
 * 在控制台输入下落时间，计算并输出距离
 * 分析：
 * 	参数：	
 * 		时间
 * 		重量可自定义
 *  需求：
 *  	输出距离
 * @author typhoon
 *
 */
public class Basic13 {
	public static void main(String[] args) {
		System.out.println("请输入下落的时间");
		System.out.println("大约需要"+(int)(9.8*Math.pow(new Scanner(System.in).nextInt(), 2))/2+"米");		
	}
}

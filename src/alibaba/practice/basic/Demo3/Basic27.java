package alibaba.practice.basic.Demo3;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @alibaba.practice
 * @TestMapIndex.java
 * @author walki
 * @2019年11月14日
 */
public class Basic27 {
	public static void main(String[] args) {
		System.out.println("请输入你需要格式化的字符串");
		// 设置提示信息
		@SuppressWarnings("resource")
		char []cs=new Scanner(System.in).next().toCharArray();
		// 就是用
		HashMap<Character, Integer> hashMap=new HashMap<>();
		for (char c : cs) {
			if (hashMap.containsKey(c)) {
				hashMap.put(c,hashMap.get(c)+1 );
			}else{
				hashMap.put(c, 1);
			}
		}
		System.out.println("这个集合中大约有如下元素："+hashMap);
	}
}

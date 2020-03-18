package alibaba.practice.basic.Demo4;

/**
 * @author typhoon
 */
public class Basic31 {
	public static void main(String[] args) {
		testStringMeta();
	}
	@SuppressWarnings("unused")
	private static void testStringBuffer() {
		StringBuffer s=new StringBuffer("本是青灯不归客");
		s.append("却因浊酒恋红尘");
		// s.append方法可以对字符串进行操作，不会创建新的对象
		/*
		 * s.delete(0, 2); // 删除制定范围内字符串
		 */		
		s.insert(1, "测试");
		// 将制定字符插入指定位置的前边
		System.out.println(s);
		// 原来的字符串也会发生变化
	}
	private static void testStringMeta() {
		String s= "    从今若许闲乘月，   ";
		// 创建String字符串对象

		System.out.println(s.concat("拄杖无时夜扣门"));
		// 使用追加字符串方法
		System.out.println("天长地久有时尽"+"此恨绵绵无绝期");
		// 使用基础运算符进行字符串拼接
		System.out.println(s.length());
		// 获取String字符串的长度
		System.out.println(s.charAt(0));
		// 返回制定索引出的char值
		System.out.println(s.compareTo("sda"));
		// 按字典顺序比较两个字符串。返回的是当前字符串对于该字符串的位置;
		System.out.println(s.compareToIgnoreCase("ASD"));
		// 按照字典的顺序判断两个字符串是否相等，不考虑大小写
		System.out.println(s.contentEquals("asd"));
		// 当且仅当当前的字符串与该字符串有相同的序列，才返回true
		System.out.println(s.endsWith("，"));
		// 判断当前字符串是否以指定的后缀结束;
		System.out.println("从今若许闲乘月".equals(s));
		// 判断两个对象是否相等
		System.out.println(s.indexOf("从"));
		// 找出字符串首次出现的位置
		System.out.println(s.lastIndexOf("，"));
		// 找出字符串最后一次出现的位置
		/*
		 * if (s instanceof String) { System.out.println("这是String的实例"); }else {
		 * System.out.println("你写的好像不对，哪里有问题"); }
		 */		
		System.out.println(s.trim());
		// 	返回字符串的副本，忽略前后的空格
	}

}

package alibaba.practice.basic.Demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author typhoon
 */
public class Basic23 {
	public static void main(String[] args) {
		Collection<String> s=new ArrayList<>();
		// 创建String泛型集合
		s.add("1");
		s.add("3");
		s.add("2");
		s.add("6");
		s.add("6");
		// list集合无须   ，可重复
		// set集合有序，且不能重复
		Collection<String> c = new HashSet<>(s);
		c.remove("5");
		c.add("1");
		System.out.println("无序，可重复的list集合中有："+s);
		System.out.println("有序，不可重复的set集合中有："+c);
		System.out.println(s.size());
		// 获取集合中元素的多少
		System.out.println("4在list中吗？"+s.contains("4"));
		// 判断某元素是否在指定集合中
		System.out.println("O,让我们看看这个集合是不是为空集"+s.isEmpty());
		System.out.println("这个集合是不是包含他的所有元素"+s.containsAll(c));
		System.out.println("从当前集合删除另一集合中不包含的元素"+s.retainAll(c));
		Iterator<String> i=c.iterator();
		// 创建迭代器，迭代集合
		while (i.hasNext()) {
			// 循环判断是否有下一个元素
			System.out.println("还有一个元素:"+i.next());
			// 依次输出下一个元素
			i.remove();
			// 删除集合中的元素
		}
		System.out.println();
		// 输出判断集合
		System.out.println();
	}
}

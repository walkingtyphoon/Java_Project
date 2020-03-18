package alibaba.practice.basic.Demo4;

/**
 * @author typhoon
 */
public class Basic32 {
	public static void main(String[] args) {
		String str="taadnetacod";
		char []c=str.toCharArray();
		int count = 0;
		for (char value : c) {
			count += value == 'a' ? 1 : 0;
		}
		System.out.println(count);
	}	
}
 
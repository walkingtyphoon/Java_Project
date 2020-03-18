package alibaba.practice.basic.Demo2;

/**
 * @author walki
 */
public class Basic16 {
	public static void main(String[] args) {
		int Sum = 150;
		for (int i = 0; i <10; i++) {
			Sum/=2;
			System.out.println(Sum%2);
		}
	}
}

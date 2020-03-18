package alibaba.practice.basic.Demo2;

/**
 * @author Typhoon
 */
public class Basic19 {
	public static void main(String[] args) {
		int x = 1;
		while (true){
			if (x%2==1){
				x+=1;
			}else{
				x += 2;
				if (x>8){
					System.out.println("3："+x);
					break;
				}else{
					x+=1;
					System.out.println("4："+x);
				}
			}
		}
	}
}
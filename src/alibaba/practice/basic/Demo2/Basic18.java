package alibaba.practice.basic.Demo2;
/**
 * 光速是指光波或电磁波在真空或介质中一秒可以跨越的距离为30万千米/称，
 * 而光年是光一年所能跨越的距离。即把一年的时间折算成秒，然后乘以30万千米，
 * 一光年约为94605亿千米，光年是长度单位。
 * 
 * @author typhoon
 */
public class Basic18 {
	public static void main(String[] args) {
		int time =29979258*60*60*24*365;
		System.out.println((long)Math.ceil(time *16.4/0.46)+"只喜鹊");
	}
}

package alibaba.practice.basic.Demo2;

import java.util.Scanner;

/**
 * This tool class is used for binary conversion. 
 * There are two main methods: binary conversion 
 * and decimal conversion.The required parameters
 * are int [] Arrays.
 * @return Sum 求出的和
 * @version 1.0
 * @author walki
 */
public class Basic14 {
	static Scanner sc=new Scanner(System.in);
	// set key object

	public static int twoBinaryConvert(int [] arrays) throws ArrayIndexOutOfBoundsException{
		int sum = 0;
		// set sum number
		for (int i = 0; i <arrays.length; i++) {
			sum+=arrays[i]*Math.pow(2, arrays.length-(i+1));
			// go on iteration count
		}
		sc.close();
		return sum;
	}
	public static long tenBinaryConvert(int number){
		int sum = 150;
		System.out.println(sum/2);
		return 0;
	}
}

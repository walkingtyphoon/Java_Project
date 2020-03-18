package the.calf.is.growing.Demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: Java workspace
 * @description: 输入一个整数数组，
 *               实现一个函数来调整该数组中数字的顺序，
 *               使得所有的奇数位于数组的前半部分，
 *               所有的偶数位于数组的后半部分，
 *               并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author: Typhoon
 * @create: 2020-02-12 10:23
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Solution01 {
    public static void reOrderArray(int [] array) {
        int value;
        // 定义初始值
        int length = array.length-1;
        // 定义迭代时的数组长度
        for (int v:array) {
            for (int i = 0; i < length; i++) {
                if (array[i]%2==0){
                    // 判断是否为偶数
                    value = array[i];
                    array[i] = array[i+1];
                    array[i+1] = value;
                    if (array[i]%2==0 && array[i+1] %2==0){
                        // 判断左右两个数是否同时为偶数
                        if (array[i] > array[i+1]){
                            // 判断是不是左边大于右边
                            value = array[i];
                            array[i] = array[i+1];
                            array[i+1] = value;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int []array = {1,2,3,4,5,6,7,8,9};
        reOrderArray(array);
    }
}

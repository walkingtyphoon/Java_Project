package alibaba.practice.basic.Demo3;

/**
 * @program: Linux_WorkSpace_Eclipse
 * @description: 测试计算数组的和
 * @author: Typhoon
 * @create: 2020-01-23 12:47
 **/
public class Basic24 {
    public static void main(String[] args) {
        int [] arrays = {1,2,3,6,6,9};
        System.out.println(sumArrays(arrays));
    }
    private static int sumArrays(int [] arrays){
        int sum = 0;
        for (int array : arrays) {
            sum += array;
        }
        return sum;
    }
}

package alibaba.practice.basic.Demo2;

import java.util.ArrayList;

/**
 * @program: Java workspace
 * @description: 期末测试题练习
 * @author: Typhoon
 * @create: 2020-02-03 20:08
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Basic15 {
    /**
     * 定义一个list，并设置泛型为Integer类型，添加元素
     * 定义一个方法，接受一个list，然后进行倒序排序，并返回一个list集合
     * @param args 主方法的参数
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        System.out.println(reverseList(arrayList));
    }

    /**
     *
     * @param arrayList 泛型为integer类型的list
     * @return 一个排序后的倒序集合
     */
    private static ArrayList<Integer> reverseList(ArrayList<Integer> arrayList){
        int temp;
        for (int i = 0; i < arrayList.size()-1; i++) {
            for (int j = 0; j < arrayList.size()-1; j++) {
                if (arrayList.get(j) < arrayList.get(j + 1)){
                    temp = arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    // 设置当前指定索引的值
                    arrayList.set(j+1,temp);
                }
            }
        }
        return arrayList;
    }
}

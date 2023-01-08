package pers.basic.selectionsort;

import java.util.Arrays;

/**
 *
 *
 *
 * @author zhanghu
 * @date 2023/1/9 0:39
 */
public class Test {
    public static void main(String[] args) {
        int[] a = {5,3,7,2,1,9,8,4};
        sort(a);
    }

    public static void sort(int[] array){
        // 在未排序序列中找到最小元素，存放到排序序列的起始位置
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
            System.out.println(Arrays.toString(array));
        }
    }
}

package pers.basic.insertsort;

import java.util.Arrays;

/**
 * @author zhanghu
 * @date 2023/1/12 23:39
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a={9,3,7,2,5,8,1,4};
        insert(a);
        System.out.println(Arrays.toString(a));
    }

    private static void insert(int[] a){
        // i 待插入元素的索引
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];// 代表待插入的元素值
            int j = i-1;//j 代表已排序区域元素索引，它会不断地在变
            while (j>=0){
                if (temp < a[j]){
                    a[j+1] = a[j];
                }
                j--;
            }
        }
    }
}

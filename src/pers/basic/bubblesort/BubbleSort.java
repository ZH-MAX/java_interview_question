package pers.basic.bubblesort;

import java.util.Arrays;

/**
 * 实现冒泡排序
 *
 * @author zhanghu
 * @date 2023/1/6 12:32
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5,9,7,4,1,3,2,8};
        bubble(a);

    }

    public static void bubble(int[] a){
        for (int j = 0; j < a.length-1; j++) {
            //比较的次数：数组长度-1
            //一轮冒泡  [5, 7, 4, 1, 3, 2, 8, 9]
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] > a[i+1]){
                    swap(a,i,i+1);
                }
            }
            System.out.println("第"+j+"轮冒泡："+Arrays.toString(a));
        }

    }

    public static void swap(int[] a,int i,int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

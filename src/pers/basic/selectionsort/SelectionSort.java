package pers.basic.selectionsort;

import java.util.Arrays;

/**
 *
 *
 *
 *
 * @author zhanghu
 * @date 2023/1/8 23:24
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {5,3,7,2,1,9,8,4};
        selection(a);
    }

    private static void selection(int[] a){
        // i 代表每轮选择最小元素要就交换到的目标索引
        for (int i = 0; i < a.length-1; i++) {
            // s 最小元素的索引
            int s = i;
            for (int j = s+1; j < a.length; j++) {
                if(a[s]>a[j]){
                    s=j;
                }
            }
            if(s!=i){
                swap(a,s,i);
            }
            System.out.println(Arrays.toString(a));
        }
    }

    public static void swap(int[] a,int i,int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

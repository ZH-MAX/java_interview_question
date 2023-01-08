package pers.basic.bubblesort;

import java.util.Arrays;

/**
 * 减少冒泡的轮数
 * 根据元素是否交换，判断排序是否完成
 *
 * @author zhanghu
 * @date 2023/1/7 20:10
 */
public class BubbleSortFinal {
    public static void main(String[] args) {
//        int[] a = {5,9,7,4,1,3,2,8};
        int[] a = {5,2,7,4,1,3,8,9};
//        int[] b = {1,2,3,4,5,6,7,8};
//        bubble(a);
        bubble_v2(a);
    }

    public static void bubble_v2(int[] a){
        int num = a.length-1;
        while (true){
            int last = 0;//最后一次交换索引的位置
            for (int i = 0; i < num; i++) {
                System.out.println("比较次数"+i);
                if (a[i] > a[i+1]){
                    swap(a,i,i+1);
                    last = i;
                }
            }
            num = last;
            System.out.println("第轮冒泡："+ Arrays.toString(a));
            if (num==0){
                break;
            }
        }
    }

    public static void bubble(int[] a){
        // 冒泡的轮数
        for (int j = 0; j < a.length-1; j++) {
            //比较的次数：数组长度-1
            //一轮冒泡  [5, 7, 4, 1, 3, 2, 8, 9]
            boolean swapped = false; // 元素是否交换
            for (int i = 0; i < a.length-1-j; i++) {
                System.out.println("比较次数"+i);
                if (a[i] > a[i+1]){
                    swap(a,i,i+1);
                    swapped = true;
                }
            }
            System.out.println("第"+j+"轮冒泡："+ Arrays.toString(a));
            if (!swapped){
                break;
            }
        }
    }

    public static void swap(int[] a,int i,int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

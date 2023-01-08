package pers.basic.selectionsort;

import java.util.Arrays;

/**
 * @author zhanghu
 * @date 2023/1/9 1:18
 */
public class SelectSortFinal {
    public static void main(String[] args) {
        int[] a = {5,3,7,2,1,9,8,4};
        selectsort(a);
    }

   public static void selectsort(int[] a){
       for (int i = 0; i < a.length; i++) {
           int minIndex = i;
           for (int j = i+1; j < a.length; j++) {
               if (a[j] < a[minIndex]){
                   minIndex = j;
               }
           }
           swap(a,minIndex,i);
//           System.out.println(Arrays.toString(a));
       }
   }

    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] =temp;
    }
}

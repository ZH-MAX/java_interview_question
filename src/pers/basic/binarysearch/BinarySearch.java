package pers.basic.binarysearch;

/**
 * 1、前提：已有排序数组 A
 * 2、定义左边界 L，右边界 R，确定搜索范围，循环执行二分查找（3、4）
 * 3、定义中间索引 M = (L+R)/2
 * 4、中间索引值 A[M]，与待搜索的值 T进行比较
 *  ① A[M] == T，表示找到，返回中间索引
 *  ② A[M] > T，中间值右侧其他元素都大于 T，无需比较，中间索引左边去找，M-1设为右边界，重新查找
 *  ③ A[M] < T，中间值左侧其他元素都大于 T，无需比较，中间索引右边去找，M+1设为左边界，重新查找
 * 5、当 L > R 时，表示没找到，结束循环
 *
 *
 * @author zhanghu
 * @date 2023/1/5 1:08
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,5,8,11,19,22,31,35,40,45,48,49,50};
        int target = 48;
        int idx = binarySearch(arr,target);
        System.out.println(idx);
    }

    //二分查找，找到返回元素索引，找不到返回-1
    public static int binarySearch(int[] a,int t){
        int L = 0;
        int R = a.length-1;
        int M;
        while (L <= R){
            M = (L+R)/2;
            if (a[M] == t){
                return M;
            }else if (a[M] > t){
                R = M -1;
            }else if (a[M] < t){
                L = M + 1;
            }
        }
        return -1;
    }
}

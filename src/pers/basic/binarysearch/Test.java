package pers.basic.binarysearch;

/**
 * @author zhanghu
 * @date 2023/1/5 22:16
 */
public class Test {
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
        int count = 0;
        while (L <= R){
            M = (L+R)/2;
            if (a[M] == t){
                count ++;
                System.out.println(count);
                return M;
            }else if (a[M] > t){
                R = M -1;
            }else if (a[M] < t){
                L = M + 1;
            }
            count++;
        }
        return -1;
    }
}

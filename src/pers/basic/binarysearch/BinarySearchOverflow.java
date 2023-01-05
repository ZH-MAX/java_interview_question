package pers.basic.binarysearch;

/**
 * 二分查找 - 整数溢出
 *
 *
 * @author zhanghu
 * @date 2023/1/5 14:05
 */
public class BinarySearchOverflow {
    public static void main(String[] args) {

        method1();

        method2();

    }

    private static void method2() {
        int L = 0;
        int R = Integer.MAX_VALUE - 1;  //20亿

//         int M = (L+R)/2;
//        无符号右移运算
        int M = (L+R) >>> 1;
        System.out.println(M);

        // 在中间值右侧
        L = M + 1;
        M = (L+R) >>> 1;
        System.out.println(M);

        System.out.println(126+63);
        System.out.println((126+63)/2);
        System.out.println((126+63)>>>1);
    }

    private static void method1() {
        int L = 0;
        int R = Integer.MAX_VALUE - 1;  //20亿

        // int M = (L+R)/2;
        // L/2+R/2 == L-L/2+R/2 == L-(L/2-R/2) == L-(L-R)/2 == L+(R-L)/2
        int M = L+(R-L)/2;
        System.out.println(M);

        // 在中间值右侧
        L = M + 1;
        // M = (L+R)/2;
        M = L+(R-L)/2;
        System.out.println(M);
    }
}

package io.dowlath.leetcode.array;

import java.util.Arrays;

/**
 * @Author Dowlath
 * @create 5/12/2020 2:24 PM
 */

/*  i/p :  [3,2,1,5,6,4]
    k   :  2
    o/p :  5

    i/p : [3,2,3,1,2,4,5,5,6 ]
    k   : 4
    o/p : 4
 */
public class FindKthLargestElement_1 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int res = solution(nums,k);
        System.out.println(res);
    }
    private static int solution(int[] a, int k){
        Arrays.sort(a);
        return a[a.length-k];
    }

}

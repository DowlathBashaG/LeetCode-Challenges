package io.dowlath.leetcode.array;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

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
public class FindKthLargestElement_2 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int res = solution(nums,k);
        System.out.println(res);
    }
    private static int solution(int[] a, int k){
       Queue<Integer> q = new PriorityQueue<>();
       for(Integer i : a){
           q.offer(i);
           if(q.size() > k)
               q.poll();
       }
        return q.peek();
    }

}

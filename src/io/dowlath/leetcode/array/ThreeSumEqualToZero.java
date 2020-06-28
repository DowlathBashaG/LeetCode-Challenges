package io.dowlath.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Dowlath
 * @create 6/11/2020 8:46 PM
 */
public class ThreeSumEqualToZero {
    public static void main(String[] args) {
        int[] a = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = solution(a);
        System.out.println(result);
    }
    public static List<List<Integer>> solution(int[] a){
        List<List<Integer>> res = new ArrayList<>();
        if(a.length == 0 || a == null){
            return res;
        }
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            int left = i+1;
            int right = a.length-1;
            while(left<right){
                 int sum = a[i] + a[left] + a[right];
                 if(sum == 0){
                     List<Integer> l = new ArrayList<>();
                     l.add(a[i]);
                     l.add(a[left]);
                     l.add(a[right]);
                     res.add(l);

                     int leftValue = a[left];
                     while(left < a.length && a[left] == leftValue){
                         ++left;
                     }

                     int rightValue = a[right];
                     while(right > left && a[right] == rightValue){
                         --right;
                     }

                 } else if(sum <0 ){
                     ++left;
                 }else{
                     --right;
                 }
            }
            while(i+1 < a.length && a[i] == a[i+1]){
                ++i;
            }
        }
        return res;
    }
}

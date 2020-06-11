package io.dowlath.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Dowlath
 * @create 6/11/2020 11:12 AM
 */
public class TwoSum {
    public static void main(String[] args) {
            int[] a = {2,7,11,15};
            int sum = 9;
            int[] result = solution(a,sum);
            System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] a , int sum){
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        if(a.length == 0 || a == null){
            return res;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int other = sum - a[i];
            if(map.containsKey(other)){
                res[0] = map.get(other);
                res[1] = i;
                return res;
            }
            map.put(a[i],i);
        }
        return res;
    }


}

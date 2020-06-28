package io.dowlath.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Dowlath
 * @create 6/13/2020 12:33 AM
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> result = solution(n);
        System.out.println(result);
    }

    private static List<List<Integer>> solution(int n){
        List<List<Integer>> res = new ArrayList<>();
        if(n==0){
            return res;
        }
        List<Integer> first = new ArrayList<>();
        first.add(1);
        res.add(first);
        if(n == 1){
            return res;
        }

        for(int i=2;i<=n;i++){
            List<Integer> prev = res.get(res.size()-1);
            List<Integer> cur = new ArrayList<>();

            for(int temp = 0;temp<i;temp++){
                cur.add(1);
            }

            for(int j=1;j<i-1;j++){
                cur.set(j,prev.get(j-1)+prev.get(j));
            }
            res.add(cur);
        }
        return res;
    }
}

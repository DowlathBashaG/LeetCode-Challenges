package io.dowlath.leetcode.array;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Arrays;

/**
 * @Author Dowlath
 * @create 6/12/2020 1:49 AM
 */
public class ThreeSum_Closest {
    public static void main(String[] args) {
        int[] a = {-1, 2, 1, -4};
        int target = 1;
        int result = solution(a, target);
        System.out.println("The result ... :" + result);
    }

    public static int solution(int[] a, int target) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        Arrays.sort(a);
        int closest = a[0] + a[1] + a[3];
        for (int i = 0; i < a.length; i++) {
            int left = i + 1;
            int right = a.length - 1;
            while (left < right) {
                int sum = a[i] + a[left] + a[right];
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    ++left;
                } else {
                    --right;
                }
            }
        }
        return closest;
    }
}


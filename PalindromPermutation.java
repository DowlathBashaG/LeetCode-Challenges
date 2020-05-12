package io.dowlath.javachallenges.leetcode;

import java.util.BitSet;

/**
 * @Author Dowlath
 * @create 5/12/2020 6:01 PM
 */
public class PalindromPermutation {
    public static void main(String[] args) {
        String s = "code";  // "aab" , "carerac"
        boolean isValidPalindrome = isValidPalindrome(s);
        System.out.println(isValidPalindrome);
    }
    private static boolean isValidPalindrome(String s) {
        if (s == null) {
            return false;
        }
        BitSet bs = new BitSet(256);
        for (char c : s.toCharArray())
            bs.flip(c);
            return bs.cardinality() <= 1;
        
    }
}

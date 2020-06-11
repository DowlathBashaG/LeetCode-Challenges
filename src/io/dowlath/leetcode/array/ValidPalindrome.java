package io.dowlath.leetcode.array;

/**
 * @Author Dowlath
 * @create 5/12/2020 5:28 PM
 */
/*
    i/p : "A man, a plan, a canal: Panama"
    o/p : true

    i/p : "race a car"
    o/p : false
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean isValidPalindrome = isValidPalindrome(s);
        System.out.println(isValidPalindrome);
    }
    private static boolean isValidPalindrome(String s){
        if( s==null){
            return false;
        }
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                ++left;
            } else if(!Character.isLetterOrDigit((s.charAt(right)))){
                --right;
            } else if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }else{
                ++left;
                --right;
            }
        }
        return true;
    }
}

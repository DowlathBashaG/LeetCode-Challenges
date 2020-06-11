package io.dowlath.leetcode.array;

/**
 * @Author Dowlath
 * @create 5/11/2020 9:24 PM
 */

// Input : Hello World  , Expected output : 5 ( ie . World - word length )
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s  = "Hello World";
        int lengthOfWord = solution(s);
        System.out.println("The length of the last word ....: "+lengthOfWord);
    }

    private static int solution(String s){
        int length = 0;
        if(s == null || s.isEmpty()){
            return length;
        }
        s = s.trim();
        int n = s.length();
        for( int i=n-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                break;
            }
            length++;
        }
        return length;
    }
}

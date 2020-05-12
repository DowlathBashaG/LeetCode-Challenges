package io.dowlath.javachallenges.leetcode;

/**
 * @Author Dowlath
 * @create 5/12/2020 6:42 AM
 */

/*
    i/p : { 0,1,0,4,12}
    o/p : 1  4  12  0  0
 */
public class MoveZeros {
    public static void main(String[] args) {
        int[] a = { 0,1,0,4,12};
        int[] res= moveZeros(a);
        for( Integer i : res){
            System.out.print(" "+ i+ " ");
        }
    }
    private static int[] moveZeros(int[] a) {
        if(a == null || a.length == 0){
            return null;
        }
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] != 0){
                a[count++] = a[i];
            }
        }
        for( int i=count;i<a.length;i++){
            a[i] = 0;
        }
        return a;
    }
}

package io.dowlath.javachallenges.leetcode;

import java.util.PriorityQueue;

/**
 * @Author Dowlath
 * @create 5/12/2020 3:06 PM
 */
public class PrirorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //int[] a = {3,2,1,5,6,4};
        pq.add(3);
        pq.add(2);
        pq.add(1);
        pq.add(5);
        pq.add(6);
        pq.add(4);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);

    }
}

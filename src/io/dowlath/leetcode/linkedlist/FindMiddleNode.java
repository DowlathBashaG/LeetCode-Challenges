package io.dowlath.leetcode.linkedlist;

/**
 * @Author Dowlath
 * @create 6/13/2020 3:48 PM
 */
public class FindMiddleNode {
       static ListNode head;
       static class ListNode{
           int data;
           ListNode next;

           ListNode(int data){
               this.data = data;
               this.next = null;
           }
       }

       public void insertNode(int value){
           ListNode node = new ListNode(value);
           if(head == null){
               head = node;
               return;
           }
           ListNode temp = head;
           while(null != temp.next){
               temp= temp.next;
           }
           temp.next = node;
       }

       public void print(){
           ListNode current = head;
           while(current != null){
               System.out.print(current.data + " --> " );
               current = current.next;
           }
           System.out.println(" null ");
       }

       public void middleNode(ListNode node){
           ListNode slowPtr = node;
           ListNode fastPtr = node;
           while(fastPtr != null && fastPtr.next != null){
               slowPtr = slowPtr.next;
               fastPtr = fastPtr.next.next;
           }
           System.out.println("Middle Element .... :"+slowPtr.data);
       }

    public static void main(String[] args) {
        FindMiddleNode fm = new FindMiddleNode();
        fm.insertNode(10);
        fm.insertNode(20);
        fm.insertNode(30);
        fm.insertNode(40);
        fm.insertNode(50);
        fm.print();
        fm.middleNode(head);

    }

}

package io.dowlath.leetcode.array;

/**
 * @Author Dowlath
 * @create 5/12/2020 6:29 AM
 */
public class ReverseLinkedList {
       ListNode head;
       static class ListNode{
           int data;
           ListNode next;
           ListNode(int d){
               this.data = d;
               this.next = null;
           }
       }

       private void insertFirst(int data){
           ListNode node = new ListNode(data);
           if(head == null){
               head = node;
               return;
           }
           ListNode temp = head;
           while(null != temp.next){
               temp = temp.next;
           }
           temp.next = node;
       }

       public void print(){
           ListNode current = head;
           while(current != null){
               System.out.print(current.data+" -> ");
               current = current.next;
           }
           System.out.println("null");
       }
       public ListNode reverse(ListNode node){
           ListNode current = node;
           ListNode prev = null;
           ListNode next = null;
           while(current != null){
               next = current.next;
               current.next = prev;
               prev = current;
               current = next;
           }
           return prev;
       }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.print();
        list.head = list.reverse(list.head);
        list.print();

    }
}

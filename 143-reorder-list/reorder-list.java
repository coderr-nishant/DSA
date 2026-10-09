/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
           return;
        }
      ListNode temp=head;
      int size=0;
      ListNode dummy=new ListNode(0);
      while(temp!=null){
        ListNode newNode=new ListNode(temp.val);
        newNode.next=dummy.next;
        dummy.next=newNode;
        temp=temp.next;
        size++;
      }
        int count=1;
        ListNode dumm=new ListNode(0);
        ListNode curr=dumm;
        ListNode temp1=head;
        while(count!=size+1){
            if(count%2!=0){
                curr.next=new ListNode(temp1.val);
                curr=curr.next;
                temp1=temp1.next;
            }else{
                curr.next=new ListNode(dummy.next.val);
                curr=curr.next;
                dummy=dummy.next;
            }
            count++;
        }
        curr = dumm.next; 
        temp1 = head; 
        while (temp1 != null && curr != null) { 
            temp1.val = curr.val; 
            temp1 = temp1.next; 
            curr = curr.next; 
        }
    }
}
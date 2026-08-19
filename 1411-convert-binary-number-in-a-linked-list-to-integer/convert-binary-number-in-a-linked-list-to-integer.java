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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        ListNode temp1=head;
        int sum=0;
        while(temp1!=null){
            sum=sum+(temp1.val*(int)Math.pow(2,count-1));
            count--;
            temp1=temp1.next;
        }
        return sum;
    }
}
public class Solution {
    public ListNode detectCycle(ListNode head) {
      ListNode slow=head;
      ListNode fast=head;
       while(fast!=null && fast.next!=null){
         slow=slow.next;
         fast=fast.next.next;
         if(fast==slow) break;
       }
       if(fast==slow) fast=head;
       if(fast==null || fast.next==null ) return null;
       while(fast!=slow){
        slow=slow.next;
        fast=fast.next;
       }
       return slow;
    }
}
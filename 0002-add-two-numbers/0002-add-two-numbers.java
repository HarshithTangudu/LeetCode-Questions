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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode result =new ListNode();
        int carry=0;
        ListNode r1= result;
        while(head1!=null || head2!=null ){
            if(head1!=null && head2!=null){
                int sum = head1.val+head2.val+carry;
                carry =sum/10;
                sum=sum%10;
                ListNode temp=new ListNode(sum,null);
                r1.next=temp;
                head1=head1.next;
                head2=head2.next;

            }
            else{
                
                if(head1==null && head2!= null){
                    int sum =head2.val+carry;
                    carry =sum/10;
                    sum=sum%10;
                    ListNode temp=new ListNode(sum,null);
                    r1.next=temp;
                    head2=head2.next;


                }
                else if(head2==null && head1 != null){
                    int sum =head1.val+carry;
                    carry =sum/10;
                    sum=sum%10;
                    ListNode temp=new ListNode(sum,null);
                    r1.next=temp;
                    head1=head1.next;


                }
                
                
            }
           
            
           
            r1=r1.next;

        }
        if(carry!=0){
                    ListNode temp=new ListNode(carry,null);
                    r1.next=temp;

                }

        return result.next;
        
    }
}
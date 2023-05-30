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

    ListNode midPoint(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;

    }

    ListNode merge(ListNode a,ListNode b)
    {
        ListNode head=new ListNode(-1);
        ListNode curr=head;

        while(a!=null && b!=null)
        {
            if(a.val<=b.val)
            {
                curr.next=new ListNode(a.val);
                a=a.next;
            }
            else
            {
                curr.next= new ListNode(b.val);
                b=b.next;
            }

                curr=curr.next;

        }

        if(a!=null)
        curr.next=a;
    
        if(b!=null)
        curr.next=b;

        ListNode tmp=head;
        head=head.next;
        tmp.next=null;

        return head;

    }


    ListNode mergeSort(ListNode head)
    {
            if(head==null || head.next==null)
            return head;



        // Break LL into 2 parts
        // Sort each part individually and then merge


        ListNode midNode=midPoint(head);
        System.out.println(midNode.val);

        // Divide the LL into 2 parts

        ListNode b=midNode.next;
        midNode.next=null;
        ListNode a=head;



        // Individually Sort these two linked list

        a=mergeSort(a);
        b=mergeSort(b);


        // Merge these two LL

        ListNode c=merge(a,b);
        return c;


    }

    public ListNode sortList(ListNode head) {
        
        return mergeSort(head);

    }
}
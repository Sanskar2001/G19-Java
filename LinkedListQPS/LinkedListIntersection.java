/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    int length(ListNode head)
    {
        ListNode tmp=head;
        int cnt=0;
        while(tmp!=null)
        {
            tmp=tmp.next;
            cnt++;
        }
        return cnt;
    }

    ListNode intersectionHelper(ListNode headA,ListNode headB,int diff)
    {

        // Move diff no of nodes ahead in List A

        ListNode tmpA=headA;

        for(int i=1;i<=diff;i++)
        tmpA=tmpA.next;



        ListNode tmpB=headB;

        while(tmpA!=null && tmpB!=null)
        {
            if(tmpA==tmpB)
            return tmpA;

            tmpA=tmpA.next;
            tmpB=tmpB.next;
        }

        return null;

    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        

        int lengthA=length(headA);
        int lengthB=length(headB);


        if(lengthA>lengthB)
        {
            // LinkedList A is longer than LinkedList B

            int diff=lengthA-lengthB;
            return intersectionHelper(headA,headB,diff);


        }

        else
        {
            // LinkedList B is longer than A or they can be equal


            int diff=lengthB-lengthA;
            return intersectionHelper(headB,headA,diff);

        }


    }
}

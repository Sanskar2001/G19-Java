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
        int cnt=0;
        ListNode tmp=head;

        while(tmp!=null)
        {
            tmp=tmp.next;
            cnt++;
        }

        return cnt;
    }

    ListNode intersectionHelper(ListNode l1, ListNode l2,int diff)
    {

        ListNode l1tmp=l1;

        System.out.println(diff);

        for(int i=1;i<=diff;i++)
        l1tmp=l1tmp.next;


        ListNode l2tmp=l2;


        while(l1tmp!=null && l2tmp!=null)
        {
             if(l1tmp==l2tmp)
            return l1tmp;
           
            l1tmp=l1tmp.next;
            l2tmp=l2tmp.next;

           
        }

        return null;
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        

        int lengthA=length(headA);
        int lengthB=length(headB);

           


            // System.out.println(lengthA+" "+lengthB);

            if(lengthA>lengthB)
            {

                // Move diff no of steps ahead in LinkedList A 
                // whereas in LinkedList B you have to stay at head only

                int diff=lengthA-lengthB;

                return intersectionHelper(headA,headB,diff);
             

            }

            else
            {
                 // Move diff no of steps ahead in LinkedList B
                // whereas in LinkedList A you have to stay at head only

                int diff=lengthB-lengthA;
                return intersectionHelper(headB,headA,diff);
            }



    }
}
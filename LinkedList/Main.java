class Main {
    


    static Node detectCycle(Node head)
    {
        Node slow=head;
        Node fast=head;


        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;


            if(slow==fast)
            return fast;
        }

        return null;
    }


    static void removeCycle(Node head,Node meetingNode)
    {
        Node slow=head;
        Node fast=meetingNode;
        Node prev=null;

        while(fast!=slow)
        {
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }

        prev.next=null;



    }


    static Node getkthNodeFromLast(Node head,int k)
    {
        Node slow=head;
        Node fast=head;

        for(int i=1;i<=k;i++)
        fast=fast.next;


        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }

        return slow;

    }

    static Node getMidPoint(Node head)
    {
        Node slow=head;
        Node fast=head;

        while (fast!=null && fast.next!=null) 
        {
            
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }


    public static void main(String[] args) {
        

        LinkedList ll =new LinkedList();

        ll.insertionAtHead(10);
        ll.insertionAtHead(20);
        ll.insertionAtHead(30);
        ll.insertionAtHead(40);
        ll.insertionAtTail(50);

        ll.head.next.next.next.next.next=ll.head.next;

        // System.out.println(detectCycle(ll.head).data);

        Node meetingNode=detectCycle(ll.head);

        removeCycle(ll.head, meetingNode);


        ll.display();


        // System.out.println("Length of LL= "+ll.getLength());

        // 40->30->20->10->50->null
        // ll.deleteAtHead();

        // ll.deletionAtKthPosition(2);

        // System.out.println(ll.getKthNode(2));

        // int value= getkthNodeFromLast(ll.head, 2).data;
        // System.out.println(value);
        
        // int midValue=getMidPoint(ll.head).data;

        // System.out.println(midValue);

        // ll.insertionAtKthPosition(100, 2);
        // ll.display();


    
    }
}

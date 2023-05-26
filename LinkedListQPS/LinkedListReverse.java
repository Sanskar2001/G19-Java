class Node
{
    int value;
    Node next;
    public Node(int value)
    {
        this.value=value;
        this.next=null;
    }
}


class LinkedListReverse
{
    Node head=new Node(1);
    head.next=new Node(2);
    head.next.next=new Node(3);
    head.next.next.next=new Node(4);


    // 1->2->3->4->NULL
}
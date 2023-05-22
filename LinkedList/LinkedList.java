class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
        next=null;
    }
}

class LinkedList
{
    Node head;


    void insertionAtHead(int data)
    {

        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    void deletionAtHead()
    {
        Node tmp=head;
        head=head.next;
        // disconnecting old head i.e. tmp from LL
        tmp.next=null;

    }
    void display()
    {
        Node tmp=head;

        while (tmp!=null) {
            
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }

    }

    
}
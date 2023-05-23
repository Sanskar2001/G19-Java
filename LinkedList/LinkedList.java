class Node
{
    int data;
    Node next;
    
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class LinkedList
{
    Node head;

    void insertionAtHead(int data)
    {
        if(head==null)
        {
            head=new Node(data);
            return;
        }

        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    void deleteAtHead()
    {
        Node tmp=head;
        head=head.next;
        tmp.next=null;
    }


    void insertionAtKthPosition(int data,int k)
    {
        if(k==0)
        {
            insertionAtHead(data);
            return;
           
        }

        Node tmp=head;

        for(int i=1;i<=(k-1);i++)
        tmp=tmp.next;


        Node newNode=new Node(data);
        newNode.next=tmp.next;
        tmp.next=newNode;
    }

    void deletionAtKthPosition(int k)
    {

        if(k==0)
        {
            deleteAtHead();
            return;
        }

        Node tmp=head;

        for(int i=1;i<=(k-1);i++)
        tmp=tmp.next;

        Node nodeToBeDeleted=tmp.next;
        tmp.next=nodeToBeDeleted.next;
        nodeToBeDeleted.next=null;

    }

    void insertionAtTail(int data)
    {
        if(head==null)
        {
            head=new Node(data);
            return;
        }

        Node tmp=head;
        while (tmp.next!=null) {
            tmp=tmp.next;
        }

        Node newNode=new Node(data);
        tmp.next=newNode;
    }



    void display()
    {
        Node tmp=head;

        while (tmp!=null) {
            System.out.println(tmp.data);
            tmp=tmp.next;
            
        }
    }

    int getKthNode(int k)
    {
        Node tmp=head;

        for(int i=1;i<=k;i++)
        tmp=tmp.next;

        return tmp.data;
    }

    int getLength()
    {
        int cnt=0;
        
        Node tmp=head;
        while (tmp!=null) 
        {
            tmp=tmp.next;
            cnt++;  
        }

        return cnt;
    }

}
class CircularQueue {
    
    int [] arr;
    int front;
    int size;


    public CircularQueue(int capacity)
    {
        arr=new int[capacity];
        front=0;
        size=0;
    }

    boolean isEmpty()
    {
        if(size==0)
        return true;

        return false;
    }

    boolean isFull()
    {
        if(size==arr.length)
        return true;

        return false;
    }

    void enQueue(int ele) throws Exception
    {
        if(isFull())
        throw new Exception("Queue is Full!! Can't enQueue any element");


        int idx=(front+size)%arr.length;
        arr[idx]=ele;
        size++;
    }

    int deQueue() throws Exception
    {
        if(isEmpty())
        throw new Exception("Queue is already Empty!!");


        int deletedElement=arr[front];
        front++;

        if(front==arr.length)
        front=0;

        return deletedElement;
    }

    


}

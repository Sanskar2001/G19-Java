class CircularQueue {
    
    int []arr;
    int front;
    int size;

    public CircularQueue(int capacity)
    {
        arr=new int[capacity];
        front=0;
        size=0;
    }

    boolean isFull()
    {
        if(size==arr.length)
        return true;

        return false;
    }

    boolean isEmpty()
    {
        if(size==0)
        return true;

        return false;
    }

    void enQueue(int ele) throws Exception
    {

        if(isFull())
        throw new Exception("Queue is Full");


        int index=(front+size)%arr.length;
        arr[index]=ele;
        size++;
    }

    int deQueue() throws Exception 
    {
        if(isEmpty())
        throw new Exception("Queue is Empty!!");

        int deletedElement=arr[front];
        front++;
        size--;

        if(front==arr.length)
        front=0;

        return deletedElement;

    }

    void display() throws Exception
    {
        if(isEmpty())
        throw new Exception("Queue is Empty");

        for(int i=0;i<size;i++)
        {
            int idx=(front+i)%arr.length;

            System.out.println(arr[idx]);
        }
    }
}

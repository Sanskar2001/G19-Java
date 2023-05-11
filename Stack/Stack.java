class Stack
{
    int[] arr;
    int top;
    int capacity;


    public Stack(int capacity)
    {
        this.capacity=capacity;
        this.arr=new int[capacity];
        this.top=-1;
    }

    boolean isEmpty()
    {
        if (top==-1) 
        return true;

        return false;
    }

    void push(int ele) throws Exception
    {
        if(isFull())
        {
            // throw new Exception("Stack Overflow!!");
            throw new StackOverflowException("Stack Overflow!!");
        }

        top++;
        arr[top]=ele;
    }

    int pop()
    {
        return arr[top--];
    }


    boolean isFull()
    {
        if(top==capacity-1)
        return true;

        return false;
    }

}
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
        if(top==-1)
        return true;

        return false;
    }

    void push(int ele) throws StackOverflowException
    {
        if(isFull())
        {
            // throw new Exception("Stack Overflow");
            throw new StackOverflowException();
        }

        top++;
        arr[top]=ele;
    }

    int pop() throws StackEmptyException
    {
        if(top == -1)
        {
            throw new StackEmptyException();
        }
        return arr[top--];
    }

    int peek() throws StackEmptyException
    {
        if(top==-1)
        throw new StackEmptyException();

        return arr[top];
    }


    boolean isFull()
    {
     
        if(top==capacity-1)
        return true;

        return false;
    }

    void display()
    {
        for(int i=top;i>=0;i--)
        System.out.println(arr[i]);
    }

  
}
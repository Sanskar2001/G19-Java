class DynamicArray {
    
    int []arr;
    int capacity;
    int size;

    public DynamicArray(int capacity)
    {
        this.capacity=capacity;
        this.arr=new int[capacity];
        this.size=0;
    }

    boolean isFull()
    {
        if(capacity==size)
        return true;

        return false;
    }

    void add(int ele)
    {
        if(isFull())
        {
            System.out.println("Array is Growing it's size");
            int[] newBigArray=new int [2*capacity];
            int i;
            for(i=0;i<size;i++)
            {
                newBigArray[i]=arr[i];
            }
            newBigArray[i]=ele;
            size++;
            capacity=2*capacity;
            arr=newBigArray;

        }
        else
        arr[size++]=ele;
    
    }


    void display()
    {
       for(int i=0;i<size;i++)
       System.out.println(arr[i]+" ");
    }

}

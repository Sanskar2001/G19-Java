class DynamicStack extends Stack{
     

    public DynamicStack(int capacity)
    {
        super(capacity);
    }


    void push(int ele)
    {
        if(isFull())
        {
            // increase capacity by 2x
            // push element

            System.out.println("Capacity incresed by 2x");

            int[] newBigArray=new int[2*capacity];

            for(int i=0;i<arr.length;i++)
            newBigArray[i]=arr[i];

            arr=newBigArray;
            
            // top++;
            // arr[top]=ele;

            arr[++top]=ele;
            capacity=2*capacity;
        }
        else
        {
            top++;
            arr[top]=ele;

            // arr[++top]=ele;
        }

    }
}

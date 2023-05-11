class DynamicArrayDemo
{
    public static void main(String[] args) {
        
        // int [] arr=new int[4];

        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=3;
        // arr[3]=4;
        // arr[4]=5;

        // for (int ele : arr) {

        //     System.out.println(ele+" ");
            
        // }

        DynamicArray dynamicArray=new DynamicArray(4);
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(10);
        dynamicArray.add(11);
        dynamicArray.add(12); 


            dynamicArray.display();
    }
}
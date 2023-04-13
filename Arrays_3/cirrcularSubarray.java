class cirrcularSubarray{



    static void printSubarrays(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int size=1;size<=n;size++)
            {
                
                for(int j=0;j<size;j++)
            {
                System.out.print(arr[(i+j)%n] + " ");
            }
            System.out.println("");


            }


            
            
        }

    }




    public static void main(String[] args) {
        

        

        int [] arr={1,2,3,4};
        printSubarrays(arr);
    }
}
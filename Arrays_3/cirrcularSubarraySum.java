 class cirrcularSubarraySum {

    static void maxSubarraySum(int[] arr)
    {
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int size=1;size<=n;size++)
            {
                
                int currentSum=0;
                for(int j=0;j<size;j++)
            {
               currentSum+=arr[(i+j)%n];
            }
            
            if(currentSum>maxSum)
            maxSum=currentSum;


            }


            
            
        }
        System.out.println("Maximum Sum= "+maxSum);

    }
    public static void main(String[] args) {
        int [] arr={1,-20,3,4};
        maxSubarraySum(arr);
    }
}

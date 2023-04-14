class circularSubarraySum2 {
    
    static int kadane(int[] arr)
    {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        boolean allNegative=true;

        int maxNo=Integer.MIN_VALUE;

        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            allNegative=false;

            if(currSum+arr[i]>0)
            currSum+=arr[i];

            else
            currSum=0;

            maxSum=Math.max(maxSum, currSum);

            maxNo=Math.max(maxNo,arr[i]);


        }

        if(allNegative)
        return maxNo;

        return maxSum;
    }



    static int minSubarraySum(int []arr)
    {

        int n=arr.length;
        int currentSum=0;
        int minSum=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(currentSum+arr[i]<0)
            currentSum+=arr[i];

            else 
            currentSum=0;

            if(currentSum<minSum)
            minSum=currentSum;

        }
        return minSum;
    }


    static int totalSum(int [] arr)
    {
        int sum=0;

        //for each loop
        for(int ele:arr)
        sum+=ele;

        return sum;
    }




    static int maxSubarraySumCircular(int[] arr) 
    {

        int n=arr.length;

        // Apply Kadane
        int normalSum=kadane(arr);

        // Circular Sum
        // circularSum=Total - minSubArraySum
        int circularSum=totalSum(arr)-minSubarraySum(arr);


        if(circularSum==0)
        return normalSum;

        if(normalSum>circularSum)
        return normalSum;

        return circularSum;
    }

    public static void main(String[] args) {
    
        int [] arr={1,-10,-20,3,4};

        System.out.println("Max Cirrcular Subarray sum is: "+maxSubarraySumCircular(arr));
    }
}

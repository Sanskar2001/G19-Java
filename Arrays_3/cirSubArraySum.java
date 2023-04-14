public class cirSubArraySum {
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

    
   static int minSubArraySum(int[] arr)
    {
        int n=arr.length;

        int currSum=0;
        int minSum=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
                if(currSum+arr[i]<0)
                currSum+=arr[i];

                else
                currSum=0;

                if(currSum<minSum)
                minSum=currSum;
        }
        return minSum;
    }

    static int total(int arr[])
    {
        int sum=0;

        for(int ele:arr)
        {
            sum+=ele;
        }
        return sum;
    }

   static int maxSubarraySumCircular(int[] arr) 
    {
        // Apply kadane on this array
            int normalSum=kadane(arr);

        // Check cirrcular Sum
        
        int circularSum=total(arr)-minSubArraySum(arr);

        if(circularSum==0)
        return normalSum;

        if(circularSum>normalSum)
        return circularSum;

        return normalSum;


    }

    public static void main(String[] args) {
        

        int arr[]={1,2,-10,-40,5};

        System.out.println("Max sum is: "+maxSubarraySumCircular(arr));
    }
    
}



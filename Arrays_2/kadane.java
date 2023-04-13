class Solution {
    public int maxSubArray(int[] arr) {

        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
    int currSum=0;
    int allNegative=1;
    for(int i=0;i<n;i++)
    {
        if(currSum+arr[i]>0)
        currSum+=arr[i];

        else
        currSum=0;

        if(arr[i]>0)
        allNegative=0;
        
        maxSum=maxSum>currSum ? maxSum : currSum;
    }


    if(allNegative==1)
    {
        int maxNo=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        maxNo= arr[i]>maxNo ? arr[i] : maxNo;

        return maxNo;

    }
    return maxSum;
    }
}
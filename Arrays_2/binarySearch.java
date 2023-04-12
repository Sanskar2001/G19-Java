class binarySearch
{

    static int bSearch(int[]arr,int target)
    {
        int s=0,e=arr.length-1,mid;
        while(s<=e)
        {
            mid=(s+e)/2;

            if(arr[mid]==target)
            return mid;

            else if(arr[mid]>target)
            e=mid-1;

            else
            s=mid+1;
        }

        return -1;
    }


    public static void main(String[] args) {
        int []arr={2,4,5,7,10,20};

        int target=5;


        int idx=bSearch(arr, target);

        System.out.println("Element found at "+idx);
    
    }
}
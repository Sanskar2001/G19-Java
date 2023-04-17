class binarySearch2DMatrix1 {

    static boolean searchMatrix(int[][] arr, int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][0]<=target && target<=arr[i][arr.length-1])
            {
                    int s=0,e=arr.length-1,mid;

                    while (s<=e) {
                        mid=(s+e)/2;

                        if(arr[i][mid]==target)
                        return true;

                        if(target<arr[i][mid])
                        e=mid-1;
                        
                        else
                        s=mid+1;
                    }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int [][]arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=16;
    }
    
}

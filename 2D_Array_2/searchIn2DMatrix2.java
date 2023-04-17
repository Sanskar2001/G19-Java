class searchIn2DMatrix2 {
    
    static boolean search(int[][] arr,int target)
    {
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<n;i++)
        {
            if(target>=arr[i][0] && target<=arr[i][m-1])
            {
                // may be element is in this row

                int s=0,e=m-1,mid;

                while (s<=e) {
                    mid=(s+e)/2;

                    if(target==arr[i][mid])
                    return true;

                    else if(target>arr[i][mid])
                    s=mid+1;

                    else 
                    e=mid-1;
                }

            }

        }

        return false;
    }

    public static void main(String[] args) {
        int [][] arr={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}

        };

        int target=30;
        boolean ans=search(arr, target);

        if(ans==true)
        System.out.println("element found");
        else
        System.out.println("not");




    }
}

class binarySearch2DMatrix
{

    static boolean searchMatrix(int[][] arr, int target) 
    {
        int n=arr.length;
        int m=arr[0].length;

        int s=0,e=n*m-1,mid;

        while (s<=e) 
        {
            mid=(s+e)/2;
            int rowNo=mid/m;
            int colNo=mid%m;

            if(target==arr[rowNo][colNo])
            return true;

            if(target>arr[rowNo][colNo])
            s=mid+1;

            else
            e=mid-1;
            
              }

              return false;
    }
    public static void main(String[] args) 
    {

        int [][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};

       boolean ans= searchMatrix(arr, 160);

       if(ans==true)
       System.out.println("Element found");
       else
       System.out.println("not found");


        

    
    }
}
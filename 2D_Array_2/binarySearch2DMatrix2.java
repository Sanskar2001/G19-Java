class binarySearch2DMatrix2
{


    static boolean search(int[][]arr,int target)
    {
        
        int n=arr.length;
        int m=arr[0].length;

        int stRow=0,enRow=n-1,midRow;

        while (stRow<=enRow) {

            midRow=(stRow+enRow)/2;

            if(target==arr[midRow][m-1])
            return true;

            else if(target>arr[midRow][m-1])
            stRow=midRow+1;
            else
            {
                int stCol=0,enCol=m-1,midCol;

                while (stCol<=enCol) {
                    midCol=(stCol+enCol)/2;

                    if(target==arr[midRow][midCol])
                    return true;

                    else if(target>arr[midRow][midCol])
                    stCol=midCol+1;

                    else
                    enCol=midCol-1;
                    
                }

                enRow=midRow-1;
            }
            
        }


        return false;
    }
    public static void main(String[] args) {
        int [][]arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=50;
        boolean ans=search(arr, target);

        if(ans==true)
        System.out.println("element found");
        else 
        System.out.println("not found");
    }
}
 class searchIn2DMatrix {
    

    static boolean search(int[][] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(target==arr[i][j])
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int [][]arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        boolean ans=search(arr,100);


        if(ans==true)
        System.out.println("Element found");
        else
        System.out.println("Element not found");


    }
}

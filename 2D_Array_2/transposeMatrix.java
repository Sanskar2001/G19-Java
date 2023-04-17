 class transposeMatrix {


    static void transpose(int [][] arr)
    {
        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int tmp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=tmp;
            }
        }
    }
    
    static void printMatrix(int [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            System.out.print(arr[i][j]);

            System.out.println("");
        }
    }


    public static void main(String[] args) {
        
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        transpose(arr);

        printMatrix(arr);
    }
}

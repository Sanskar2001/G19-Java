class antiClockwiseRotateMatrix {

    static void printMatrix(int [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            System.out.print(arr[i][j]);

            System.out.println("");
        }
    }
    
    static void reverseRow(int [][] arr)
    {

        for(int i=0;i<arr.length;i++)
        {
            // Reverse each and every Row
            // maintain two pointers s and e and perform the reversal
            // current row just like an array
            int s=0,e=arr.length-1;

            while (s<=e) {
                int tmp=arr[i][s];
                arr[i][s]=arr[i][e];
                arr[i][e]=tmp;

                s++;
                e--;
                
            }
        }
    }

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

    public static void main(String[] args) {
        
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};

        reverseRow(arr);
        transpose(arr);

        printMatrix(arr);


    }
}

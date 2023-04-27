 class spiral {
    

    static void spiralPrint(int[][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;
        int stRow=0,stCol=0,enRow=n-1,enCol=m-1;
        int cnt=0;

        while(stRow<=enRow && stCol<=enCol)
        {
            // 1. STROW

            for(int i=stCol;i<=enCol;i++)
            {
                System.out.print(arr[stRow][i]+" ");
                cnt++;
                if(cnt==m*n)
                return;
            }
            stRow++;

            // 2. ENCOL

            for(int i=stRow;i<=enRow;i++)
            {
                System.out.print(arr[i][enCol]+" ");
                cnt++;
                if(cnt==m*n)
                return;

            }
            enCol--;

            // 3. ENROW

            for (int i = enCol; i>=stCol ; i--) 
            {
                System.out.print(arr[enRow][i]+" "); 
                cnt++;
                if(cnt==m*n)
                return;  
            }
            enRow--;

            // 4. STCOL
            for(int i=enRow;i>=stRow;i--)
            {
                System.out.print(arr[i][stCol]+" ");
                cnt++;
                if(cnt==m*n)
                return;
            }
            stCol++;
        }
    }   


    public static void main(String[] args) {
        
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

      

        /*
         *   1 2 3
         *   4 5 6 
         *   7 8 9
         * 
         * 
         *   1 2  3   4
         *   5 6  7   8
         *   9 10 11 12
         */

        spiralPrint(arr);
    }
}

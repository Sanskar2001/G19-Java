class TwoDArrayDemo
{
    public static void main(String[] args) {
     
        
        // intialisation

        int  arr[][]={{1,2,3,10},{4,5,6,20},{7,8,9,30}};
        int [][] arr2={{10,20,30},{40,50,60},{70,80,90}};





       int [][] jaggedArray={{1,2,3},{4,5},{6,7,8,9}};

       int [][] jag= new int[][]{
            new int [] {1,2},
            new int [] {3,4,5},
            new int [] {6,7,8,9}

       };

       
    


       int [][] demo=new int[3][5];



    //    for(int i=0;i<demo.length;i++)
    //    {
    //         for(int j=0;j<demo[0].length;j++)
    //            System.out.print(demo[i][j]);

    //            System.out.println("");

    //    }

       


       int [][] jaggedArray2=new int[4][];

       jaggedArray2[0]=new int [1];
       jaggedArray2[1]=new int[5];
       jaggedArray2[2]=new int[7];
       jaggedArray2[3]=new int[3];


       for(int i=0;i<jaggedArray2.length;i++)
       {
            for(int j=0;j<jaggedArray2[i].length;j++)
            System.out.print(jaggedArray2[i][j]);

            System.out.println("");

       }

    






    }
}
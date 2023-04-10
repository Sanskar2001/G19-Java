 class pattern {
    public static void main(String[] args) {
        

        int n=5;

        for(int i=1;i<=n;i++)
        {

            // print n-i spaces
            for(int j=1;j<=(n-i);j++)
            System.out.print(" ");
            

            char ch='A';

            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }


            // for(int j=1;j<=(i-1);j++)
           



            System.out.println("");



        }
    }
    
}

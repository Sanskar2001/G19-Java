public class bitwise {

    static int getIthBit(int n,int i)
    {
         n=n>>(i-1);
        return n&1;
    }

    static int getTotalBits(int n)
    {
        int totalBits=0;

        while (n!=0) {
        
            n=n>>1;
            totalBits++;
        }
        return totalBits;
    }

    static void printInBinary(int n)
    {

        int totalBits=getTotalBits(n);

        for(int i=totalBits;i>0;i--)
        System.out.print(getIthBit(n, i));

    }
    public static void main(String[] args) {

        int a=15;

        // 1100

        // System.out.println(getIthBit(a, 4));

        // for(int i=4;i>0;i--)
        // {
        //     System.out.print(getIthBit(a, i));
        // }

        // System.out.println(getTotalBits(a));

        printInBinary(a);
        
    }
    
}

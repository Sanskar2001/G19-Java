class nthMagicNo {

    static int magicNo(int n)
    {
        int ans=0;
        int factor=5;

        while (n!=0) {
            
            if((n&1)==1)
            ans+=factor;

            factor=factor*5;
            n=n>>1;
        }

        return ans;
    }
    
    public static void main(String[] args) {

        int n=4;
        System.out.println(n+"th magic no is "+magicNo(n));

    }
}

class incredibleHulk
{

    static int minJumps(int n)
    {
        int cnt=0;

        while (n!=0) {
            
            if((n&1)==1)
            cnt++;

            n=n>>1;
        }

        return cnt;
    }
    public static void main(String[] args) {


        int n=4;

        System.out.println("Min no of jumps="+minJumps(n));
        
    }
}
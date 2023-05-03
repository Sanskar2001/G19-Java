class Substrings {


    static void printAllSubstrings(String str)
    {

        int n=str.length();
        for(int st=0;st<n;st++)
        {
            for(int en=st+1;en<=n;en++)
            {
                System.out.println(str.substring(st, en));
            }
        }

    }

    static void printAllSubstringsReverse(String str)
    {

        int n=str.length();
        for(int st=n-1;st>=0;st--)
        {
            for(int en=st+1;en<=n;en++)
            {
                System.out.println(str.substring(st, en));
            }
        }

    }


    public static void main(String[] args) {

        String str="abc";

        // printAllSubstrings(str);
        
        printAllSubstringsReverse(str);

        
    }
    
}

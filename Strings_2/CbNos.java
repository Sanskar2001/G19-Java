class CbNos
{
    static int countCbNos(String str)
    {

        int n=str.length();
        int visited[]=new int[n];
        int cnt=0;

        for(int st=n-1;st>=0;st--)
        {
            for(int en=st+1;en<=n;en++)
            {
                String currSubstring=str.substring(st, en);

                Long currNo=Long.valueOf(currSubstring);
               
                if(isCbNo(currNo))
                System.out.println(currNo);


                if(isCbNo(currNo) && isValid(st, en, visited))
                {
                    cnt++;
                   

                    for(int i=st;i<en;i++)
                    {
                        visited[i]=1;
                    }

                }
            

            }
        }

            return cnt;

    }

    static boolean isValid(int st,int en,int[] visited)
    {
        for(int i=st;i<en;i++)
        {
            if(visited[i]==1)
            return false;
        }

        return true;

    }


    static boolean isCbNo(Long no)
    {
        if(no==0 || no==1)
        return false;

        int [] CBNos={2,3,5,7,11,13,17,19,23,29};


        for(int ele:CBNos)
        {
            if(no==ele)
            return true;

            if(no%ele==0)
            return false;
        }

        return true;

    }

    public static void main(String[] args) {
        

        String str="81615";
        
        System.out.println(countCbNos(str));
    }
}
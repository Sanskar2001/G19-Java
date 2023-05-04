class ReverseWord
{

    static String reverse(String str)
    {
        String ans="";

        for(int i=str.length()-1;i>=0;i--)
        {
            ans+=str.charAt(i);
        }
        return ans;
    }

    static String reverseWords(String str)
    {
        int n=str.length();
        String ans="";

        int i=n-1;

        while(i>=0)
        {

            while(str.charAt(i)==' ')
            {
                i--;
            }

            String word="";

            while(str.charAt(i)!=' ')
            {
                word+=str.charAt(i);
                i--;
            }

            ans+=reverse(word)+" ";

        }

        return ans;
    }
    public static void main(String[] args) {
        
        String str="example good    a";

        System.out.println(reverse(str));


    }
}
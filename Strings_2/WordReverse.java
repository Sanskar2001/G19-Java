class WordReverse {
    
    static String reverseString(String str)
    {
        int n=str.length();
        String ans="";
        for(int i=n-1;i>=0;i--)
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


        while (i>=0) {
            

            while (i>=0 && str.charAt(i)==' ') {
                
                i--;
            }

            String word="";

            while (i>=0 && str.charAt(i)!=' ') {
                word+=str.charAt(i);
                i--;
            }

            ans+=reverseString(word);

            if(!word.isEmpty())
            ans+=" ";


        }

        return ans.substring(0, ans.length()-1);
    }

    public static void main(String[] args) {
        
        String str="   Hello   World    ";

        System.out.println(reverse(str)+"*");
    }
}

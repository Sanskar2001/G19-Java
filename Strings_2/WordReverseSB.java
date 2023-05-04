public class WordReverseSB {

    static String reverseWords(String str)
    {
        int n=str.length();
        // String ans="";
        StringBuilder ans=new StringBuilder();

        int i=n-1;


        while (i>=0) {
            

            while (i>=0 && str.charAt(i)==' ') {
                
                i--;
            }

            StringBuilder word=new StringBuilder("");

            while (i>=0 && str.charAt(i)!=' ') {
                word.append(str.charAt(i));
                i--;
            }

            ans.append(word.reverse());

            if(!word.isEmpty())
            ans.append(" ");


        }

        return ans.substring(0, ans.length()-1);
    }

    public static void main(String[] args) {
        
        String str="   Hello   World    ";

        System.out.println(reverseWords(str)+"*");
    }
    
}

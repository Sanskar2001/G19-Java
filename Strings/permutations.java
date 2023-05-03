 class permutations {
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        
        int freq[]=new int[256];
        
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            
            freq[ch-'a']++;
        }
        
        for(int i=0;i<b.length();i++)
        {
            char ch=b.charAt(i);
            freq[ch-'a']--;
        }
        
        
        
        for(int i=0;i<256;i++)
        {
            if(freq[i]!=0)
            return false;
        }
        
        
        return true;
        
    }

    public static void main(String[] args) {
        String str1="abc",str2="bac";

        System.out.println(isAnagram(str1, str2));
    }
}


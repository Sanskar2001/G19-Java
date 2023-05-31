import java.util.*;
class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	static public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Set<Integer>set=new HashSet<Integer>();
        
        for(int i=0;i<=n-2;i++)
        {
            for(int j=i+1;j<=n-1;j++)
            {
                
                int sum=arr[i]+arr[j];
                
                if(set.contains(-sum))
                return true;
            }
            
            set.add(arr[i]);
        }
        
        return false;
        
    }

    public static void main(String[] args) {
        
        int [] arr={1,2,-3,4,5};

            if (findTriplets(arr, arr.length)) {
                System.out.println("Triplet with 0 sum exists");;
            }
        
    }
}
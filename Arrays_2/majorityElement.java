// https://leetcode.com/problems/majority-element/description/
class Solution {
    public int majorityElement(int[] nums) {

     int cnt=1;
     int value=nums[0];
        int n=nums.length;
     for(int i=1;i<n;i++)
     {
         if(cnt==0)
         {
             value=nums[i];
             cnt=0  ;
         }

         if(nums[i]==value)
         {
             cnt++;
         }
         else
         cnt--;  
    //  }
         
    }
    return value;
}
}
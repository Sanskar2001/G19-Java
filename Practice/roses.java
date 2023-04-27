import java.util.Arrays;

class roses
{
    static void minPriceRoses(int[] arr,int target)
    {
        Arrays.sort(arr);

        int rose1=0,rose2=0;
        int minDiff=Integer.MAX_VALUE;
        int s=0,e=arr.length-1;

        while(s<e)
        {

            if(arr[s]+arr[e]==target)
            {
                    if(arr[e]-arr[s]<minDiff)
                    {
                        rose1=arr[s];
                        rose2=arr[e];
                        minDiff=rose2-rose1;
                        e--;
                    }
            }

            else if(arr[s]+arr[e]<target)
            {
                s++;
            }

            else 
            e--;

        }

        System.out.println(rose1+" "+rose2);
    }

    public static void main(String[] args) {
        
        int arr[]={10,2,6,8,4};
        int money=10;

        minPriceRoses(arr, money);
    }
}
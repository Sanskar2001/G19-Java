import java.util.Arrays;

class chocolateSale
{

    static int minCost(int[]arr,int k)
    {
        int n=arr.length;
        Arrays.sort(arr,0,n);

        int cost=0,varities=0;

        for(int currentPrice:arr)
        {
            cost+=currentPrice;
            varities+=k+1;

            if(varities>=n)
            break;
        }

        return cost;
    }
    public static void main(String[] args) {
        int []arr={3,2,1,4};
        int k=2;

        System.out.println("min cost= "+minCost(arr, k));
    }
}
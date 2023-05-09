class CheckPointsOnStLine
{

    static boolean checkOnStline(int[][] arr)
    {
        float slope=10000.0f;

        if(arr[0][0]!=arr[1][0])
        slope= (float)(arr[1][1]-arr[0][1])/(arr[1][0]-arr[0][0]);

        System.out.println(arr[1][1]-arr[0][1]);
          System.out.println(arr[1][0]-arr[0][0]);
        
    



        for(int i=1;i<=arr.length-2;i++)
        {

             float currentSlope=10000.0f;
            if(arr[i][0]!=arr[i+1][0])
            currentSlope=(float)(arr[i+1][1]-arr[i][1])/(arr[i+1][0]-arr[i][0]);

            System.out.println(currentSlope);

            if(currentSlope!=slope)
            return false;
        }


        return true;

        
    }

    public static void main(String[] args) {
        
        int arr[][]={{1,2},{2,3},{3,4},{4,5},{5,6},{6,7} };

        if(checkOnStline(arr))
        System.out.println("Points lie on st line");
        else 
        System.out.println("Does'nt lie on st line");

    }
}
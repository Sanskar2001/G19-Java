 class selectionSort {

    static void selSort(int [] arr)
    {

        int n=arr.length;

        for (int i = 0; i < n; ++i)
	{
		int smallest=arr[i];
		int idx=i;

		for (int j = i+1; j<n ; ++j)
		{
			if(smallest>arr[j])
			{
				smallest=arr[j];
				idx=j;
			}
		}


		int tmp=arr[i];
		arr[i]=smallest;
		arr[idx]=tmp;
	}
    }


   static void changeValue(int a)
    {

        a=20;
    }

    public static void main(String[] args) {
        

        int [] arr={10,2,5,1,16};

        selSort(arr);


        int x=12;

        System.out.println(" Before x= "+x);
        changeValue(x);
        System.out.println(" After x= "+x);


        // for(int i=0;i<arr.length;i++)
        // System.out.print(arr[i]+" ");


        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}

class insertionSort {
    

    static void insSort(int arr[])
    {

        int n=arr.length;
        for (int i = 1; i <n; ++i)
	{
		

		int currElement=arr[i];

		int j=i-1;

		while(j>=0 && arr[j]>currElement)
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=currElement;
	}
    }

    public static void main(String[] args) {
        
        int[] arr={10,23,1,5,6};

        insSort(arr);


        for (int i : arr) {
            
            System.out.print(i+" ");
        }
    }
}

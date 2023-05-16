import java.util.Stack;

class StockSpan {
    
    public static int[] calculateSpan(int arr[], int n)
    {
        int [] span=new int [n];
        Stack<Integer>st=new Stack<Integer>();

        for(int i=0;i<n;i++)
        {
            while(!st.empty() && arr[i]>=arr[st.peek()])
            {
                st.pop();
            }

              span[i]= (st.empty()) ? i+1 : i -st.peek();
                st.push(i);
        }

        return span;
    }
    public static void main(String[] args) {

        int [] arr={100, 80, 60, 70, 60, 75, 85};
        int n=7;


        int[] ans=calculateSpan(arr, n);

        for(int ele:ans)
        {
            System.out.print(ele+" ");
        }
        
    }
}

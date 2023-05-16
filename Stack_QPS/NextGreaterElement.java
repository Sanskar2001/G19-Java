import java.util.Stack;

class NextGreaterElement
{

    public static long[] nextLargerElement(long[] arr, int n)
    {
        long[] ans=new long[n];
        Stack<Long> st=new Stack<Long>();

        for(int i=n-1;i>=0;i--)
        {
            while(!st.empty() && arr[i]>=st.peek())
            {
                st.pop();
            }

            ans[i]= (st.empty() ) ? -1 : st.peek();
            st.push(arr[i]);
        }

        return ans;


    }
    public static void main(String[] args) {
        
        long [] arr={6, 8, 0, 1, 3};
        int n=5;

        long [] ans=nextLargerElement(arr, n);


        for (long ele : ans) {

            System.out.print(ele+" ");
            
        }
        
    }
}
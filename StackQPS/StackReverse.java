import java.util.Stack;
class StackReverse
{

    static void display(Stack<Integer>st)
    {
        while (!st.empty()) {
            System.out.println(st.pop());
        }
    }



    static void insertAtBottom(Stack<Integer>st,int ele)
    {
        if(st.empty())
        {
            st.push(ele);
            return;
        }

        int topEle=st.pop();
        insertAtBottom(st,ele);
        st.push(topEle);

    }

   static void reverseStack(Stack<Integer>st)
    {

        if(st.empty())
        return;

        int topEle=st.pop();
        reverseStack(st);
        insertAtBottom(st,topEle);


    }



    public static void main(String[] args) {
        
        Stack<Integer>st=new Stack<Integer>();

        st.push(1);
        st.push(2);
        st.push(3);

        reverseStack(st);

        display(st);
        


        // Stack<Integer>tmpSt=new Stack<Integer>();

        // while(!st.empty())
        // {
        //     int topEle=st.pop();
        //     tmpSt.push(topEle);

        // }
        // st=tmpSt;

        // display(st);

    



    }
}
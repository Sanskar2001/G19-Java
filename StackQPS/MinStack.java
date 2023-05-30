import java.util.Stack;
public class MinStack {
    
    Stack<Integer>st; // storing the actual contents
    Stack<Integer>minSt; // storing min so far


    public MinStack()
    {
        st=new Stack<Integer>();
        minSt=new Stack<Integer>();
    }


    void push(int ele)
    {

        st.push(ele);

        if(minSt.empty())
        minSt.push(ele);

        if(ele<minSt.peek())
        minSt.push(ele);

        else
        minSt.push(minSt.peek());
    }

    int pop()
    {
        if(st.empty())
        {
            System.out.println("Stack is empty!");
            return -1;
        }

  
        minSt.pop();
        return  st.pop();
    }

    int getMin()
    {
        if(st.empty())
        {
            System.out.println("Stack is empty!");
            return -1;   
        }

        return minSt.peek();
    }



}

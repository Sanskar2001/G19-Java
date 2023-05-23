public class StackClient {
    

    public static void main(String[] args) {
        

        // int a=100;
        Stack st=new Stack(4);

        try{
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }


        Stack st2=new Stack(2);
        try{
        
        st2.push(1);
        st2.push(2);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        // while (!st2.isEmpty()) {


        //     try {
        //         System.out.println(st2.peek());
        //     st2.pop();
                
        //     } catch (Exception e) {
        //        System.out.println(e);
        //     }

            
        // }
        // st2.display();





        DynamicStack dynamicStack=new DynamicStack(2);
        dynamicStack.push(1);
        dynamicStack.push(2);
        dynamicStack.push(3);
        dynamicStack.push(4);
        dynamicStack.push(5);

        dynamicStack.display();

    
        
      
    }
}

public class MyThread extends Thread{

    public void run()
    {
        
            int i=0;
            while(true)
            {
                System.out.println("This is Thread2 "+i);
                i++;
            }
           
        
    }
}

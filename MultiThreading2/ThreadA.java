public class ThreadA extends Thread
{
    public void run()
    {
        int i=0;
        while (true) {
            System.out.println("ThreadA "+i);
            i++;
        }
        
    }
} 
    


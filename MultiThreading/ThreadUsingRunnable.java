public class ThreadUsingRunnable implements Runnable{

    @Override
    public void run() {
    
        int i=0;
        while(true)
        {
            System.out.println("This is Thread 3 "+i);
            i++;
        }
    }
    


    
}

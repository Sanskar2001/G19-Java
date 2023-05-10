public class ThreadUsingRunnable implements Runnable{

    @Override
    public void run() {
       System.out.println("This is executed in a separte thread");
    }
    
}

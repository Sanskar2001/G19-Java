class ThreadA extends Thread
{
    public void run()
    {
        System.out.println("ThreadA");
    }
}

class isAliveDemo {
    
    public static void main(String[] args) {
        


        ThreadA threadA=new ThreadA();
        System.out.println(threadA.isAlive());
        threadA.start();

        try {
            threadA.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        System.out.println(threadA.isAlive());
    
       

    }
}

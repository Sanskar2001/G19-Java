class ConcurrencyExample {
    
    public static void main(String[] args) {
        
        // int no=10000;
        // for(int i=0;i<no;i++)
        // {
        //     System.out.println("Hello");
        // }


        // Way 1  to create a thread
        // Make a class that extends Thread Class
        // Make an object of this class
        // Call the start method on this object
        MyThread thread2=new MyThread();
        thread2.start();


        // Way 2 to create a thread
        // Make a class that implements Runnable Interface
        // Make an object of this class
        // Make an object of Thread Class and pass the object
        // created in prev step to constructor of Thread Class

        ThreadUsingRunnable threadUsingRunnable =new ThreadUsingRunnable();

        Thread thread3=new Thread(threadUsingRunnable);

        thread3.start();




        int i=0;
        while(true)
        {
            System.out.println("This is Main Thread "+i);
            i++;
        }
           
        
    }
}

class Main {
    

    public static void main(String[] args) {
        

        MyThread myThread=new MyThread("T2");

        ThreadUsingRunnable threadUsingRunnable=new ThreadUsingRunnable();

        Thread thread2=new Thread(threadUsingRunnable);
        thread2.start();

        System.out.println(thread2.isAlive());

        myThread.setName("Thread-2");
        myThread.setPriority(Thread.MAX_PRIORITY);

        System.out.println(myThread.getId());
        System.out.println(myThread.threadId());
        System.out.println(myThread.getName());
        System.out.println(myThread.getPriority());
        System.out.println(myThread.getState());



        Thread thread=new Thread("T1");
        System.out.println(thread.getId());
        System.out.println(thread.threadId());
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
        
    }
}

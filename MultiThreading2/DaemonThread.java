class DaemonThread {

    public static void main(String[] args) {

        ThreadA threadA=new ThreadA();
        threadA.setDaemon(true);
        threadA.start();


        Thread mainThread=Thread.currentThread();

        try {
            mainThread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // try {
        //     Thread.sleep(5000);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        
    }
    
}

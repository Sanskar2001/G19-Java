class YieldExample {

    public static void main(String[] args) {
        

        ThreadA threadA=new ThreadA();

        threadA.start();

        int i=0;
        while (true) {
            System.out.println("Main "+i);
            Thread.yield();
            i++;
        }



    }

}

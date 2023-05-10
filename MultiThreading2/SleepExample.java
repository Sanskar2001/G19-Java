public class SleepExample {

    public static void main(String[] args) {
        
        int i=0;

        while (true) {

            System.out.println("Main "+i);
            i++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }


    }
    
}

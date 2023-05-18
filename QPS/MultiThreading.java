import java.util.Scanner;

class AvailableTickets extends Thread{

    int availableTickets;
    int johnReq;
    int MikeReq;

    public AvailableTickets(int availableTickets, int johnReq, int MikeReq) {

        this.availableTickets = availableTickets;
        this.johnReq = johnReq;
        this.MikeReq = MikeReq;
    }


    public void run()
    {

        synchronized(this)
        {

            Thread currentThread=Thread.currentThread();
            if((currentThread.getName()).equals("John"))
            {

                if(johnReq>availableTickets)
                {
                    System.out.println("John: Not Booked");
                    return;
                }


                availableTickets-=johnReq;
                System.out.println("John: Ticket Booked:"+johnReq);
    
            }

            else
            {

                if(MikeReq>availableTickets)
                {
                    System.out.println("Mike: Not Booked");
                    return;
                }

                availableTickets-=MikeReq;
                System.out.println("Mike: Ticket Booked:"+MikeReq);

            }

            

        }

       
    }

}



class MultiThreading {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int availableTickets=sc.nextInt();
        int johnReq=sc.nextInt();
        int mikeReq = sc.nextInt();
        
        AvailableTickets a = new AvailableTickets(availableTickets, johnReq, mikeReq); 

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);

        t1.setName("John");
        t2.setName("Mike");

        t1.setPriority(10);

        t1.start();
        t2.start();
    }



}
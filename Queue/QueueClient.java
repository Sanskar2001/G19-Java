class QueueClient {
    
public static void main(String[] args) {
    

    // Queue queue=new Queue(3);

    // try {
        
    //     queue.enQueue(2);
    //     queue.enQueue(3);
    //     queue.deQueue();
    //     queue.deQueue();
    //     queue.enQueue(4);
    //     queue.display();
    // } catch (Exception e) {
    //    System.out.println(e);
    // }

        CircularQueue circularQueue=new CircularQueue(4);

        try {
            circularQueue.enQueue(10);
            circularQueue.enQueue(20);
            circularQueue.enQueue(30);
            circularQueue.enQueue(40);
            circularQueue.deQueue();
            circularQueue.enQueue(50);
            circularQueue.display();
        } catch (Exception e) {
            System.out.println(e);
        }

    
       

  
}

}

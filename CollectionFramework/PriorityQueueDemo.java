import java.util.PriorityQueue;

class PriorityQueueDemo {
    

    public static void main(String[] args) {
        
        
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<Integer>();
        priorityQueue.add(27);
        priorityQueue.add(60);
        priorityQueue.add(55);
        priorityQueue.add(12);
        priorityQueue.add(14);

        System.out.println(priorityQueue);
        priorityQueue.remove();
        System.out.println(priorityQueue);
        priorityQueue.remove();
        System.out.println(priorityQueue);
        
    }
}

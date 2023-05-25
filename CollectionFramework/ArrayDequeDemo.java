import java.util.ArrayDeque;
class ArrayDequeDemo {
    

    public static void main(String[] args) {
        
        ArrayDeque<Integer>arrayDeque=new ArrayDeque<Integer>();

        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);
        arrayDeque.addFirst(500);
        arrayDeque.addLast(1000);


        arrayDeque.offerFirst(700);

        arrayDeque.removeFirst();
        arrayDeque.removeLast();

        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());

    
        System.out.println(arrayDeque);


        for(Integer ele:arrayDeque)
        System.out.println(ele);

    }
}

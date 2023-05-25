import java.util.LinkedList;
class LinkedListDemo
{

    public static void main(String[] args) {
        

        LinkedList<Integer>ll=new LinkedList<Integer>();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.addFirst(100);
        ll.offer(500);
        ll.offerFirst(150);


       System.out.println( ll.element() );
        System.out.println(ll.peek());

        // ll.remove();

        // System.out.println(ll.poll());
        

        for(int i=0;i<ll.size();i++)
        System.out.println(ll.get(i));
    }
}
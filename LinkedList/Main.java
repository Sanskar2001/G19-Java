class Main {
    

    public static void main(String[] args) {
        

        LinkedList ll =new LinkedList();

        ll.insertionAtHead(10);
        ll.insertionAtHead(20);
        ll.insertionAtHead(30);
        ll.insertionAtHead(40);
        ll.insertionAtTail(50);


        // 40->30->20->10->50->null
        // ll.deleteAtHead();

        // ll.deletionAtKthPosition(2);

            System.out.println(ll.getKthNode(2));
            
        // ll.insertionAtKthPosition(100, 2);
        // ll.display();


    
    }
}

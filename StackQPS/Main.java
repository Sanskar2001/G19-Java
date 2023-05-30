class Main {

    
    public static void main(String[] args) {
        

       MinStack minStack=new MinStack();

        minStack.push(5);
        minStack.push(3);
        minStack.push(10);
        minStack.push(0);

        System.out.println(minStack.getMin());

    }
}

class ArithmaticExceptionDemo {

    public static void main(String[] args) {
        

        // try {
        //     int c=10/0;
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        try {
            int c=10/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}

class ExceptionDemo
{
    public static void main(String[] args) {
        

        int a=10,b=0;

       

        try {
            int c=a/b;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }



        System.out.println("Program flow will reach here");
    }
}
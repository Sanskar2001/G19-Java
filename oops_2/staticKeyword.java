class staticKeyword
{
        static int a;

        static
        {
            a=100;
            System.out.println("This is static block, this is executed even before main");
        }


        void fun()
        {
            System.out.println("Hello");
        }

        static void printMsg()
        {
            System.out.println("This is static method");
        }

    public static void main(String[] args) {

        System.out.println("Inside Main");
        
        staticKeyword obj=new staticKeyword();

        obj.fun();

        System.out.println(a);
        printMsg();
    }
}
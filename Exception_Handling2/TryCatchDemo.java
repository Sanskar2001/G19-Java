class TryCatchDemo {
    

    public static void main(String[] args) {
        
        try{
            int c=10/5;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{

            System.out.println("Flow will always reach here");
        }

    }
}

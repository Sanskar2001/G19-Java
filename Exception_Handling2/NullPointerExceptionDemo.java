class A
{
    int x;
}

class NullPointerExceptionDemo {
    
    public static void main(String[] args) {
        
        A obj=null;

        try{
            System.out.println(obj.x);
        }
        catch(NullPointerException e)
        {
         System.out.println(e);   
        }
     
    }

}

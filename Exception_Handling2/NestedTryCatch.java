import java.io.*;
class NestedTryCatch {

    

    public static void main(String[] args) {
        
        File file = new File("filename.txt");
        

        /* 

        try{
            int c=10/2;
            FileInputStream fis = new FileInputStream(file);
    
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }

        */

        try{
            int c=10/0;
            try{
            FileInputStream fis = new FileInputStream(file);
            }
            catch(FileNotFoundException e)
            {
                System.out.println(e);
            }
    
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        


       
    }
}

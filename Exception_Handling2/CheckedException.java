import java.io.*;
class CheckedException {
    

    public static void main(String[] args) {
        
        File file = new File("filename.txt"); // replace with your file name
      

       try{
        FileInputStream fis = new FileInputStream(file);
       }
       catch(Exception e)
       {
        System.out.println(e);
       }

       System.out.println("Flow will reach here");
        
    }
}

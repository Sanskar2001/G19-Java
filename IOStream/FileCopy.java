import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class FileCopy {
    
    public static void main(String[] args) {
         
        try {
            FileInputStream fis=new FileInputStream("/Users/sanskaratrey/Documents/G19-Java/IOStream/f1.txt");

            byte[] arr=new byte[fis.available()];
            fis.read(arr);

            FileOutputStream fos=new FileOutputStream("/Users/sanskaratrey/Documents/G19-Java/IOStream/f2.txt");
            fos.write(arr);


            fis.close();
            fos.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}

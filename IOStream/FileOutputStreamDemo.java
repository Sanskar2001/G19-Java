import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class FileOutputStreamDemo {
    

    public static void main(String[] args) {
        
        try {
            FileOutputStream fos=new FileOutputStream("/Users/sanskaratrey/Documents/G19-Java/IOStream/file.txt",true);
            // fos.write(65);
            fos.write("This is written using output stream".getBytes());
            fos.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

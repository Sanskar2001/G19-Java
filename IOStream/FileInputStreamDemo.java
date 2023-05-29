import java.io.FileInputStream;
import java.io.FileNotFoundException;

class FileInputStreamDemo
{
    public static void main(String[] args) {
        
        try {
            FileInputStream fis=new FileInputStream("/Users/sanskaratrey/Documents/G19-Java/IOStream/file.txt");
            // System.out.println((char)fis.read());


            // int x=fis.read();

            // while(x!=-1)
            // {
            //     System.out.print((char)x);
            //     x=fis.read();
            // }
            byte[] arr=new byte[fis.available()];
            fis.read(arr);
            String str=new String(arr);
            System.out.println(str);

            fis.close();


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
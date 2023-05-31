import java.io.FileInputStream;
import java.io.StreamTokenizer;

public class StringTokeniserDemo {
    

    public static void main(String[] args) throws Exception {
        

        FileInputStream fis=new FileInputStream("/Users/sanskaratrey/Documents/G19-Java/IOStream/f1.txt");

        StreamTokenizer streamTokenizer=new StreamTokenizer(fis);

        int currentToken=streamTokenizer.nextToken();

        while(currentToken!=StreamTokenizer.TT_EOF)
        {
            // Print the value of current Token 
            // next Token

            System.out.print("Current Token="+currentToken+" ttype="+streamTokenizer.ttype);

            if(currentToken==StreamTokenizer.TT_WORD)
            System.out.println(streamTokenizer.sval);

            else if(currentToken==StreamTokenizer.TT_NUMBER)
            System.out.println(streamTokenizer.nval);

            currentToken=streamTokenizer.nextToken();


        }

    }
}

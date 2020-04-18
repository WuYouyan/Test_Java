import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) throws IOException {
        /*TEST of Java！！！*/
        FileReader example = new FileReader("D:\\wyy\\IdeaProjects\\Test_Java\\src\\hello.txt");
        StreamPrinter.print(example);

    }
}

class StreamPrinter {
    // TODO: strengthen the `print()`
    // knowledge JAVA IO stream Reader
    static void print(Reader reader) throws IOException {
        int code = 0;
        while ((code = reader.read()) != -1){
            System.out.print((char) code);
            code = reader.read();
        }
        /* or
        while(true)
        {
            int code = reader.read();
            if(code==-1)
                break;
             System.out.print((char)code);  //reader a char of the file
        }
        */
        reader.close();

    }
}

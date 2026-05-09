import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBytes{
    public static void main(String[] args){
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("example.txt");
            //data to write
            String data = "Hello, world!";
            //converts the strin to bytes
            byte[] byteData = data.getBytes();

            //write bytes fo the file
            fileOutputStream.write(byteData);

            
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(fileOutputStream != null){
                try{
                    fileOutputStream.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBytes{
    public static void main(String[] args){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("example.txt");
            int byteData;

            while((byteData = fileInputStream.read()) != -1){
                System.out.println((char) byteData);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(fileInputStream != null){
                try{
                    fileInputStream.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
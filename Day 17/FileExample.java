import java.io.File;

public class FileExample{
    public static void main(String [] args){

        File myFile = new File("file.txt"); 

        if(myFile.exists()){
            System.out.println("File exists.");
        }else{
            System.out.println("File does not exist");
        }
    }
}
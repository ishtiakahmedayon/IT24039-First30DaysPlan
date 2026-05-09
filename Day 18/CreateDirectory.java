import java.io.File;

public class CreateDirectory{
    public static void main(String [] args){
        
        String directoryPath = "Projects/Java";

        File directory = new File(directoryPath);

        if(!directory.exists()){
            boolean created = directory.mkdirs();
            if(created){
                System.out.println("Directory created successfully" + directoryPath);

            }else{
                System.out.println("Directory already exists: " + directoryPath);
            }
        }
    }
}
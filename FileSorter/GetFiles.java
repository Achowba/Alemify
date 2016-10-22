import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class GetFiles {
    public static void main(String[] args) throws IOException {
                            
        File ach = new File("D:\\Movies\\New");        
        String[] x10tion = new String[] { "mp4", "FLV" };

        System.out.println("Retreiving all .txt and .exe files in " + ach.getPath() + " including those in subdirectories" + "\n");

        List <File> files = (List <File>) FileUtils.listFiles(ach, x10tion, true);
        for (File file : files) {
            System.out.println("File(s) wey we see na: " + file.getPath());
        }    
    }
}
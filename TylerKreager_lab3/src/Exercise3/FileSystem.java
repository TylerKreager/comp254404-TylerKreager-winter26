package Exercise3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class FileSystem {

    public static int find(String path, int i){
        File file = new File(path);
        File[] files = file.listFiles();

        if (files.length == i) {
            System.out.println("\nTotal files " + i);
            return i;
        }
        System.out.println("\nFile: " + (i + 1) + "\nName: " + files[i].getName());
        i++;
        return find(path, i);
    }



    public static void CreateFilledFolder() throws IOException {
        File folder = new File("./TylerKreager_lab3/src/Exercise3/newFolder");
        if(folder.mkdir()) {
            System.out.println("Folder created");
            for(int i=0; i<500; i++){
                UUID uuid = UUID.randomUUID();
                File file = new File( folder + "/" + uuid + ".txt");
                file.createNewFile();
                FileWriter writer = new FileWriter(file);
                writer.write("Hello world!");
                writer.close();
            }
        }
        else {
            System.out.println("Folder not created");
        }
    }
}

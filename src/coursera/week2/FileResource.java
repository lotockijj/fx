package coursera.week2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Роман Лотоцький on 20.12.2016.
 */
public class FileResource {

    String[] s;

    public void createFile(String myFile){
        try {

            File file = new File(myFile);

            if (file.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] words(String file){
        createFile(file);
        Path fPath = Paths.get(file);
        try( Scanner scanner = new Scanner(fPath, "UTF8")) {
            List<String> list = new ArrayList<>();
            while (scanner.hasNextLine()) {
                try ( Scanner scanner2 =new Scanner(scanner.next())){
                    while (scanner2.hasNext()) {
                        list.add(scanner2.nextLine());
                    }
                }
            }
            s = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                s[i] = list.get(i);
            }
        } catch (IOException e){
            System.out.println(e);
        }
        return s;
    }
}

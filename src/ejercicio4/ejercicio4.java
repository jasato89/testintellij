package ejercicio4;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

public class ejercicio4 {

    public static void main(String[] args) {

        File file = new File("/users/jasato/Desktop");
        String extension = ".*.txt";
        ArrayList<File> list = new ArrayList<>();


        for (File f : storeIt(list, file,extension)) {
            System.out.println(f.getAbsolutePath());
        }
    }

    private static ArrayList<File> storeIt (ArrayList<File> list, File file, String ext) {


            for (File f2: file.listFiles()){

                if (f2.getName().matches(ext)) {
                    list.add(f2);
                }

                if (f2.isDirectory()) {
                    File newFile = new File(f2.getAbsolutePath());
                    storeIt(list, newFile, ext);
                }

        }

        return list;

    }

}

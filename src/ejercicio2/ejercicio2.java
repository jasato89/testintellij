package ejercicio2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ejercicio2 {

    public static void main(String[] args) {

        /*Realiza un programa que cree un directorio en el directorio actual, luego cree tres ficheros
en dicho directorio donde uno se borre y otro se renombre. Crearle también un subdirectorio con un
fichero dentro. Después mostrar la ruta absoluta de ambos directorios y sus contenidos.*/

        File directorio1 = new File("Directorio1");
        File file1 = new File(directorio1, "file1.txt");
        File file2 = new File(directorio1, "file2.txt");
        File file3 = new File(directorio1, "file3.txt");
        File directorio2 = new File(directorio1, "Directorio2");


        try {
            if (directorio1.mkdir()){
                System.out.println(directorio1.getName() + " creado correctamente");
            }

            if (file1.createNewFile()) {
                System.out.println(file1.getName() + " creado correctamente");
            } else {
                System.out.println("No se ha podido crear el fichero");
            }
            if (file2.createNewFile()) {
                System.out.println(file2.getName() + " creado correctamente");
            } else {
                System.out.println("No se ha podido crear el fichero");
            }
            if (file3.createNewFile()) {
                System.out.println(file3.getName() + " creado correctamente");
            } else {
                System.out.println("No se ha podido crear el fichero");
            }
            if (directorio2.mkdir()) {
                System.out.println(directorio2.getName() + " creado correctamente");
            } else {
                System.out.println("No se ha podido crear el directorio");
            }
            String file2name = file2.getName();
            if (file2.delete()) {
                System.out.println(file2name + " borrado correctamente");
            }else {
                System.out.println("No se ha podido borrar el archivo");
            }
            String file3name = file3.getName();
            if (file3.renameTo(new File(directorio1,"archivo.txt"))) {
                System.out.println(file3name + " ahora se llama archivo.txt");

            }else {
                System.out.println("No se ha podido cambiar el nombre del archivo");
            }

            System.out.println("Ruta relativa de " + directorio1.getName() + ": " + directorio1.getPath());
            System.out.println("Ruta absoluta de " + directorio1.getName() + ": " + directorio1.getAbsolutePath());
            System.out.println("Ruta relativa de " + directorio2.getName() + ": " + directorio2.getPath());
            System.out.println("Ruta absoluta de " + directorio2.getName() + ": " + directorio2.getAbsolutePath());


        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
    }
}

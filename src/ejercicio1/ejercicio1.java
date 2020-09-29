package ejercicio1;

import java.io.File;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        /*Realiza un programa que dado un fichero que se le solicite al usuario, muestre su nombre, si
es un ejecutable, si está oculto, la ruta relativa, la ruta absoluta y el tamaño.*/

        Scanner input = new Scanner(System.in);
        String path;

        System.out.println("Introduce la ruta de tu fichero:");

        path = input.nextLine();

        File userFile = new File(path);

        fileInfo(userFile);


    }

    public static void fileInfo(File file) {

        System.out.printf(" - Ruta relativa: %s\n " +
                        "- Ruta absoluta: %s\n - Nombre del " +
                "archivo: %s\n - ¿Es un ejecutable? %s\n - " +
                "¿Está oculto? %s\n - Tamaño: %d\n",
                file.getPath(), file.getAbsolutePath(),
                file.getName(), file.canExecute() ? "Sí":"No",
                file.isHidden() ? "Si" : "No", file.length());


    }
}

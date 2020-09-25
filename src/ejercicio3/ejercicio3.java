package ejercicio3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class ejercicio3 {

    public static void main(String[] args) throws IOException {
        /*Realiza un programa que muestre el nombre y tipo (fichero o directorio) de los ficheros y
        subdirectorios contenidos en un directorio solicitado al usuario. Mostrar también el contenido de
        todos los subdirectorios y si éstos contienen subdirectorios también...y así sucesivamente hasta
        mostrar todo el contenido de dicho directorio.*/


        Scanner scanner = new Scanner(System.in);

        String input;

        System.out.println("Introduce la ruta del directorio");

        input = scanner.nextLine();

        File dir = new File(input);

        if (dir.isDirectory()) {

            Files.walk(Paths.get(input)).forEach(x-> System.out.printf("Tipo de documento: %s\n " +
                    "Nombre del archivo: %s\n Ruta del archivo: %s\n\n" +
                    "", x.toFile().isFile() ? "Documento":"Carpeta", x.getFileName(), x));
        } else {
            System.out.println("No es un directorio válido");
        }

    // METHOD RECURSIVE

        System.out.println("\n\nMétodo recursivo\n\n");

        System.out.println("Introduce otra ruta:");

        String input2 = scanner.nextLine();

        File newFolder = new File(input2);

        File[] list = newFolder.listFiles();

        for (File f : list) {
            printIt(f);
        }



        }

        private static void printIt (File file) {

        if (file.isDirectory()) {
            for (File f2 : file.listFiles()) {
                printIt(f2);
            }
        }else {
            System.out.printf("Tipo de documento: %s\n " +
                    "Nombre del archivo: %s\n Ruta del archivo: %s\n\n" +
                    "", file.isFile() ? "Documento":"Carpeta", file.getName(), file.getPath());
        }

        }

    }


package io.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class OldFileName {

    public static void main(String[] args) throws IOException {
        File file = new File("temp/example.txt");
        File directory = new File("temp/exampleDir");

        System.out.println("file.exists = " + file.exists());

        boolean create = file.createNewFile();
        System.out.println("File created = " + create);

        boolean dirCreate = directory.mkdir();
        System.out.println("Directory created = " + dirCreate);

//        boolean delete = file.delete();
//        System.out.println("File deleted = " + delete);
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + directory.isDirectory());
        System.out.println("File Name: " + file.getName());
        System.out.println("File size: " + file.length() +" bytes");
        File newFile = new File("temp/newExample.txt");
        boolean renamed = file.renameTo(newFile);
        System.out.println("File renamed = " + renamed);

        long lastModified = newFile.lastModified();
        System.out.println("lastModified = " + new Date(lastModified));

        /**
         * file.exists = false
         * File created = true
         * Directory created = false
         * Is file: true
         * Is directory: true
         * File Name: example.txt
         * File size: 0 bytes
         * File renamed = true
         * lastModified = Mon Dec 15 13:57:56 KST 2025
         */

    }
}

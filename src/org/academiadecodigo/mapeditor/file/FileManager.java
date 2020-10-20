package org.academiadecodigo.mapeditor.file;

import java.io.*;

public class FileManager {

    public static String load(String path) {
        //returns the 000 and 111 for the grid to redraw itself
        FileReader reader = null;
        String S="";
        try {
            String s="";
            reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);
           while ((s = bufferedReader.readLine())!=null){
               S+= s + "\n";
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return S;
    }

    public static void save(String path, String s) {
        //receives the grid.tostring and saves it
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter writer = new BufferedWriter(fileWriter) ;
            writer.write(s);
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //save(file, text)
    //lead(file)
}

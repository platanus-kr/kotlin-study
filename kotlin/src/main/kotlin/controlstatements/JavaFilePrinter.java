package controlstatements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaFilePrinter {

    public void readFile() throws IOException {
        File currentFile = new File(".");
        File file = new File(currentFile.getAbsoluteFile() + "/file.txt");

        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println(reader.readLine());

        reader.close();
    }

    public static void main(String[] args) throws IOException{
        JavaFilePrinter printer = new JavaFilePrinter();
        printer.readFile();
    }
}

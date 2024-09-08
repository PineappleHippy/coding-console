// readFile.java

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java ReadFile <file-path>");
            return;
        }
        String filePath = args[0];
        CommandCenter.printFileContent(filePath);
    }
}

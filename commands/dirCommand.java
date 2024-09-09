// dirCommand.java

import java.io.File;

public class DirCommand {
    public static void main(String[] args) {
        File folder = new File(".");
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName() + (file.isDirectory() ? "/" : ""));
            }
        } else {
            System.out.println("No files found.");
        }
    }
}

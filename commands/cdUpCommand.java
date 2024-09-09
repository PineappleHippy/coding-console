// cdUpCommand.java

import java.io.File;

public class CdUpCommand {
    public static void main(String[] args) {
        File currentDir = new File(".");
        File parentDir = currentDir.getParentFile();
        if (parentDir != null) {
            System.setProperty("user.dir", parentDir.getAbsolutePath());
            System.out.println("Moved up to: " + parentDir.getAbsolutePath());
        } else {
            System.out.println("No parent directory.");
        }
    }
}

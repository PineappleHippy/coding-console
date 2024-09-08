// commandCenter.java

public class CommandCenter {
    public static void printHelloWorld() {
        System.out.println("Hello, World!");
    }

    public static void printFileContent(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// exampleProgram.java

public class ExampleProgram {
    public static void main(String[] args) {
        System.out.println("Running example program...");
        CommandCenter.printHelloWorld();
        System.out.println("Reading example.txt...");
        CommandCenter.printFileContent("example.txt");
    }
}

[UserCodeCompiles]

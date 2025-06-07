import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextUI {
    private final AppService appService;
    Scanner scanner;

    public TextUI(AppService appService) {
        this.appService = appService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        this.readAnimalFromFile();
    }

    public void printCow() {
        System.out.println("            ^__^            ");
        System.out.println("    _______/(oo)            ");
        System.out.println("/\\/(       /(__)            ");
        System.out.println("   | w----||                ");
        System.out.println("   ||     ||                ");
    }

    public void printCowSaysHello() {
        System.out.println("                    _______ ");
        System.out.println("                   < hello >");
        System.out.println("                    ------- ");
        System.out.println("            ^__^   /        ");
        System.out.println("    _______/(oo)  /         ");
        System.out.println("/\\/(       /(__)            ");
        System.out.println("   | w----||                ");
        System.out.println("   ||     ||                ");
    }

    public Path inputFilePath() {
        System.out.println("Input the file path:");
        String input = this.scanner.nextLine();
        Path filePath = Paths.get(input);
        if (Files.exists(filePath) && Files.isRegularFile(filePath)) {
            return filePath;
        } else {
            System.out.println("File not found!");
        }
        return null;
    }

    public void readAnimalFromFile() {
        Path filePath = this.inputFilePath();
        if (filePath != null) {
            try {
                List<String> lines = Files.readAllLines(filePath);
                for (String line : lines) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Could not read file: " + e.getMessage());
            }
        }

    }
}

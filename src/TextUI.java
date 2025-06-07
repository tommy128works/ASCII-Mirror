import java.util.Scanner;

public class TextUI {
    private final AppService appService;
    Scanner scanner;

    public TextUI(AppService appService) {
        this.appService = appService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        this.inputFilePath();
        this.printCow();
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

    public void inputFilePath() {
        System.out.println("Input the file path:");
        String input = this.scanner.nextLine();
        System.out.println(input);
    }
}

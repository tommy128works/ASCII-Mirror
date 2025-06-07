public class TextUI {
    private final AppService appService;

    public TextUI(AppService appService) {
        this.appService = appService;
    }

    public void start() {
        this.printCow();
    }

    public void printCow() {
        System.out.println("                    _______ ");
        System.out.println("                   < hello >");
        System.out.println("                    ------- ");
        System.out.println("            ^__^   /        ");
        System.out.println("    _______/(oo)  /         ");
        System.out.println("/\\/(       /(__)            ");
        System.out.println("   | w----||                ");
        System.out.println("   ||     ||                ");
    }
}

public class Main {
    public static void main(String[] args) {
        AppService appService = new AppService();
        TextUI textUI = new TextUI(appService);
        textUI.start();

        // Your code here
    }
}

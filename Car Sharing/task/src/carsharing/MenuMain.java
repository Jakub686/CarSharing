package carsharing;


import java.util.Scanner;

public class MenuMain {
    public static void mainMenu() {
        boolean endCondition = true;
        Scanner scanner = new Scanner(System.in);
        do {
            View.showLogInAsAManager();
            View.showExit();

            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    MenuLogedIn.logedIn();
                case "0":
                    endCondition = false;
            }
        } while (endCondition);
    }
}

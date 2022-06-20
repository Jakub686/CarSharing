package carsharing;

import java.util.Scanner;

public class Menu {
    public static void menu(){
        boolean endCondition = true;
        Scanner scanner = new Scanner(System.in);
        do{
            View.logIn();
            View.exit();
            String input = scanner.nextLine();
            switch (input){
                case "1":
                    MenuLoggedIn.menuLoggedIn();
                case "0":
                    endCondition = false;
            }

        }while (endCondition);
    }
}

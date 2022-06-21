package carsharing;

import java.util.Scanner;

public class MenuLogedIn {
    public static void logedIn() {
        Scanner scanner = new Scanner(System.in);
        boolean endCondition = true;
        do {
            View.showCompanyList();
            View.showCreateACompany();
            View.showBack();

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    ReadTable.readTable();
                    break;
                case "2":
                    InsertTable.insertTable();
                    break;
                case "0":
                    endCondition = false;
                    break;
            }
        } while (endCondition);
    }
}

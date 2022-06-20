package carsharing;

import java.util.Scanner;

public class MenuLoggedIn {

    public static void menuLoggedIn(){

        boolean endCondition = true;
        Scanner scanner = new Scanner(System.in);
        do{
            View.companyList();
            View.createCompany();
            View.back();
            String input = scanner.nextLine();
            switch (input){
                case "1":

                case "2":
                    endCondition = false;
                case "0":
                    endCondition = false;
            }

        }while (endCondition);

    }



}

package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    Logging logging = new Logging();

    public void startMenu() {
        Scanner scn = new Scanner(System.in);
//        System.out.println("1. Добавить нового пользователя.");
//        System.out.println("2. Удалить существующего пользователя.");
//        System.out.println("3. Проверить существует ли пользователь.");
//        System.out.println("4. Изменить логин существующего пользователя.");
//        System.out.println("5. Изменить пароль существующего пользователя.");
//        System.out.println("6. Выход");
//        int tmp = scn.nextInt();
//        switch (tmp) {
//            case 1:
//                logging.add();
//                startMenu();
//                break;
//            case 2:
//                logging.remove();
//                startMenu();
//                break;
//            case 3:
//                logging.contains();
//                startMenu();
//                break;
//            case 4:
//                logging.changeLogin();
//                startMenu();
//                break;
//            case 5:
//                logging.changePassword();
//                startMenu();
//                break;
//            case 6:
//                System.out.println("Сеанс завершено");
//                break;
//            case 7:
//                logging.printLogin();
//                logging.printPas();
//                startMenu();
//                break;
//            default:
//                System.out.println("Не вірно ведено пункт");
//                startMenu();
//
//        }

        boolean b = true;
        while (b){
            System.out.println("1. Добавить нового пользователя.");
            System.out.println("2. Удалить существующего пользователя.");
            System.out.println("3. Проверить существует ли пользователь.");
            System.out.println("4. Изменить логин существующего пользователя.");
            System.out.println("5. Изменить пароль существующего пользователя.");
            System.out.println("6. Выход");
            int tmp = scn.nextInt();
            if (tmp ==1){
                logging.add();
            } else if (tmp==2) {
                logging.remove();
            } else if (tmp==3) {
                logging.contains();
            } else if (tmp==4) {
                logging.changeLogin();
            } else if (tmp==5) {
                logging.changePassword();
            } else if (tmp==6) {
                System.out.println("Сеанс завершено");
                b=false;
            } else if (tmp==7) {
// Для перевірки введених даних
                logging.printLogin();
                logging.printPas();
            } else {
                System.out.println("Не вірно ведено пункт");
            }
        }
    }


    public static void main(String[] args) {
        App app = new App();
        app.startMenu();

    }
}

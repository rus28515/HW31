package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Logging {
    private List<String> login;
    private List<String> password;
    private int index;
    private String tmpLogin;
    private String tpmPassword;

    public Logging() {
        login = new ArrayList<>();
        password = new ArrayList<>();
    }

    public void add() {
        Scanner scn = new Scanner(System.in);
        boolean check = true;
        /*
        Створення логіна.
        Обмеження:
        1) Мінімум 3 символи;
        2) Унікальність;
         */
        while (check) {
            System.out.println("Ведіть ім'я нового користувача: ");
            tmpLogin = scn.nextLine();
            if (tmpLogin.length() > 2) {
                if (login.size() == 0) {
                    login.add(tmpLogin);
                    check = false;
                } else {
                    boolean nameMatchingCheck = login.contains(tmpLogin);
                    if (nameMatchingCheck == false) {
                        login.add(tmpLogin);
                        check = false;
                    } else {
                        System.out.println("Користувач з таким ім'я існує");
                    }
                }
            } else {
                System.out.println("Коротке ім'я, придумайте інше");
            }
        }

        check = true;
        /*
        Створення пароля.
        Обмеження:
        1) Мінімум 6 символів
         */
        while (check) {
            System.out.println("Ведіть пароль для нового користувача: ");
            tpmPassword = scn.nextLine();
            if (tpmPassword.length() > 3) {
                password.add(tpmPassword);
                System.out.println("Нового користувача створено");
                check = false;
            } else {
                System.out.println("Пароль короткий, придумайте інший");
            }
        }
    }

    public void remove() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведіть ім'я користувача, якого хочете видалити?");
        tmpLogin = scn.nextLine();
        boolean tmp = login.contains(tmpLogin);
        if (login.contains(tmpLogin)) {
            index = login.indexOf(tmpLogin);
            login.remove(index);
            password.remove(index);
            System.out.println("Користувача видалено");
        } else {
            System.out.println("Такого користувача не існує");
        }
    }

    public void contains() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведіть ім'я користувача");
        tmpLogin = scn.nextLine();
        if (login.contains(tmpLogin)) {
            System.out.println("Такий користувач існує в базі");
        } else {
            System.out.println("Такого користувача не існує");
        }
    }

    public void changeLogin() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведіть ім'я користувача, якого хочете змінити");
        tmpLogin = scn.nextLine();
        if (login.contains(tmpLogin)) {
            index = login.indexOf(tmpLogin);
            System.out.println("Ведіть нове ім'я для користувача");
            tmpLogin = scn.nextLine();
            login.set(index, tmpLogin);
            System.out.println("Ім'я користувача змінено");
        } else {
            System.out.println("Такого користувача не існує");
        }
    }

    public void changePassword() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведіть ім'я користувача, пароль якого хочете змінити");
        tmpLogin = scn.nextLine();
        if (login.contains(tmpLogin)) {
            index = login.indexOf(tmpLogin);
            System.out.println("Ведіть новий пароль");
            tpmPassword = scn.nextLine();
            password.set(index, tpmPassword);
            System.out.println("Пароль змінено");
        } else {
            System.out.println("Такого користувача не існує");
        }
    }

    public void printLogin() {
        System.out.println("LOGIN: " + login);
    }

    public void printPas() {
        System.out.println("PASSWORD: " + password);
    }

}

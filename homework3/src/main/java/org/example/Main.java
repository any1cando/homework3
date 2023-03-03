package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String number,  manufacturer;
        int year;
        System.out.println("Куманцов Максим Александрович");
        System.out.println("Группа РИБО-01-21");
        System.out.println();
        System.out.println("Введите номер вашего телефона:");
        number = scan();
        while (true) {
            System.out.println();
            System.out.println("Введите год производства вашего телефона:");
            try {
                year = Integer.parseInt(scan());
                if (year > 2023) {
                    System.out.println("Этот год еще не наступил:) Попробуйте снова");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Необходимо ввести целое число! Попробуйте снова");
            }
        }
        System.out.println();
        System.out.println("Введите производителя:");
        manufacturer = scan();
        System.out.println();
        TelephoneApparat telephoneApparat = new TelephoneApparat(number, year, manufacturer);
        System.out.println("Телефон создан!");
        System.out.println( telephoneApparat);
        System.out.println();
        System.out.println("Результат работы метода:");
        Seller seller = new Seller("Ivan");
        seller.modify(telephoneApparat);
        System.out.println(telephoneApparat);

    }

    public static String scan() {
        return new Scanner(System.in).nextLine();
    }
}
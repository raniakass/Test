//import java.util.Scanner;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        String Alamedin;
        final int NUM = 8;
        String word = "Hello";
        Alamedin = (NUM + ":Alamedin");
        System.out.println(Alamedin);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положиетльное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String userName = scanner.nextLine();
        System.out.println("привет," + userName + "!");
    }
}
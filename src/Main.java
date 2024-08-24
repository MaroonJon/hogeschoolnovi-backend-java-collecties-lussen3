import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        String[] alphabetic = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};


        boolean play = true;

        String invalidInput = "ongeldige invoer ";

        Scanner scanner = new Scanner(System.in);

        Translator translator = new Translator(alphabetic, numeric);

        while (play) {
            System.out.println("type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();
            if (input.equals("X")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();
                scanner.nextLine();

                if (number >=0 && number <= 9) {
                    String result = translator.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                } else {
                    System.out.println(invalidInput);
                }
            } else {
                System.out.printf(invalidInput);
            }

        }
    }

}

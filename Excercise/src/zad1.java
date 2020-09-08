import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {


        Scanner scann = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int client = scann.nextInt();
        System.out.println("Podaj ilość swoich punktów z zakupów?");
        int regular = scann.nextInt();

        if (regular >= 1000) {
            if (client > 65) {
                System.out.println("Jesteś stałym klientem i Twoj rabat wynosi 15% ");

            } else if (client < 18) {
                System.out.println("Jesteś stałym klientem i Twój rabat wynosi 30%");
            } else if ((client >= 18) && (client <= 65)) {
                System.out.println("Jesteś stałym klientem i Twój rabat wynosi 5%");
            } else {
                System.out.println("Błędna informacja");
            }

        }
        if (regular <1000){
            if (client > 65) {
                System.out.println("Twoj rabat wynosi 10% ");

            } else if (client < 18) {
                System.out.println("Twój rabat wynosi 25%");
            } else if ((client >= 18) && (client <= 65)) {
                System.out.println("Nie posiadasz rabatu");
            } else {
                System.out.println("Błędna informacja");
            }
        }

    }
}

import java.util.Scanner;


public class Discount {
    public static void main(String args[]){

        int regularCustomer = 1000;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ile masz lat. ");

        while (!scan.hasNextInt()) {
            System.out.println("Błędne dane. Podaj ile masz lat.");
            scan.next();
        }
        if (scan.hasNextInt()) {
            int customer = scan.nextInt();
            System.out.println("Podaj ile masz punktów. (W przypadku minimum 1000 pkt. jesteś stałym klientem)");
            while (!scan.hasNextInt()) {
                System.out.println("Błędne dane. Podaj ile masz punktów.");
                scan.next();
            }
            int regular = scan.nextInt();
            if (((customer < 18 && customer > 0) && (regular < regularCustomer))) {
                System.out.println("Masz mniej niż 18 lat i nie jesteś stałym klientem. Twoja zniżka wynosi 25%.");

            } else if (((customer < 18 && customer > 0) && (regular >= regularCustomer))) {
                System.out.println("Masz mniej niż 18 lat i jesteś stałym klientem. Twoja zniżka wynosi 30%");

            } else if (((customer > 18) && (customer < 66)) && (regular < regularCustomer)) {
                System.out.println("Masz mniej niż 65 i więcej jak 17 lat, a także nie jesteś stałym klientem. Twoja zniżka wynosi 0%.");

            } else if (((customer > 18) && (customer < 66)) && (regular >= regularCustomer)) {
                System.out.println("Masz mniej niż 66 lat i więcej jak 17 lat, a także jesteś stałym klientem. Twoja zniżka wynosi 5%.");

            } else if ((customer > 65) && (regular < regularCustomer)) {
                System.out.println("Masz więcej niż 65 lat i nie jesteś stałym klientem. Twoja zniżka wynosi 10%");

            } else if ((customer > 65) && (regular >= regularCustomer)) {
                System.out.println("Masz więcej niż 65 lat i jesteś stałym klientem. Twoja zniżka wynosi 15%");

            } else if ((customer <= 0)){
                System.out.println("Błędna informacja z wiekiem.");
            }
        }
    scan.close();
    }

}



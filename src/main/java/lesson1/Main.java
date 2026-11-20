package lesson1;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        byte a = 2;
        short b;
        int c;
        long d;

        float e;
        double f;

        char g = '3';
        boolean s = true;
        boolean k = false;

        int statusCode = 200;

        int balance = 500;
        int copiedBalance = balance;

        copiedBalance = 1000;

        System.out.println(copiedBalance);
        System.out.println(balance);

        int [] statuses = {200, 201, 400};
        int [] copiedStatuses = statuses;
        copiedStatuses[0] = 500;

        System.out.println(statuses[0]);
        System.out.println(copiedStatuses[0]);

        String name = "HELLO";
        System.out.println(name.equals("Hello"));

        int ten = 10;
        int three = 3;
        System.out.println(ten + three);
        System.out.println(ten - three);
        System.out.println(ten * three);
        System.out.println(ten / three);
        System.out.println(ten % three);

        int actualStatusCode = 200;
        int expectedStatusCode = 201;

        if (actualStatusCode != expectedStatusCode) {
            System.out.println("Status is correct");
        } else {
            System.out.println("Uncorrect status");
        }
        System.out.println(actualStatusCode == expectedStatusCode);
        System.out.println(actualStatusCode != expectedStatusCode);
        System.out.println(actualStatusCode > expectedStatusCode);
        System.out.println(actualStatusCode < expectedStatusCode);
        System.out.println(actualStatusCode >= expectedStatusCode);
        System.out.println(actualStatusCode <= expectedStatusCode);

        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue && isFalse);
        System.out.println(isTrue || isFalse);
        System.out.println(!isTrue);
    }
}

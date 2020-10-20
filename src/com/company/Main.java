package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        package com.company;

import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                Scanner keyboard = new Scanner(System.in);

                double orange = 0.25, apple = 0.60;
                int amountapple, amountorange;
                double total;

                System.out.println("Put the amount of oranges that you got ");
                amountapple = keyboard.nextInt();

                System.out.println("Put the amount of apples that you got");
                amountorange = keyboard.nextInt();

                System.out.println("Apple total " + amountapple * apple);
                System.out.println("Orange total " + amountorange * orange);

                total = amountapple * apple + amountorange * orange;

                System.out.println("Total to be paid: " + total);

            }
        }
    }
}

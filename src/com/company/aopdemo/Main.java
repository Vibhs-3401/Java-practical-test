package com.company.aopdemo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("======= PACKING ITEM =======");
        System.out.println();
        System.out.println("Purpose: To find different ways of packing 'N' number of items.");
        boolean flag = true;
        while (flag) {
            System.out.println("Please enter amount of item: ");
            try {
                int n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Please enter valid amount: ");
                    n = scanner.nextInt();
                } else {
                    PackItem packItem = new PackItem();
                    String wayOfPacking = packItem.packingItem(n);
                    System.out.println("Different ways of packing " + n + " items are:\n" + wayOfPacking);
                    System.out.println("Do you want to continue? Write 'y' or 'n' accordingly: ");
                    String doContinue = scanner.next();
                    if(!doContinue.equalsIgnoreCase("y")) {
                        System.out.println();
                        System.out.println("====== EXITING ======");
                        flag = false;
                    }
                }
            } catch (Exception e) {
                flag = false;
                System.out.println("Message: " + e.getMessage());
            }
        }

    }
}

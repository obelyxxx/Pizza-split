package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int person = scan.nextInt();
        int slices = scan.nextInt();

        int result = slices;
        while ((result % person) != 0) {
            result = result + slices;
        }

        System.out.println(result/slices);
    }
}

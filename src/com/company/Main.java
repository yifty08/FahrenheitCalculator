package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the F temp: ");
        int ftemp = scanner.nextInt();
        double ctemp = (ftemp-32)*5/9;
        System.out.println("The celcius temp is " + ctemp);
    }
}

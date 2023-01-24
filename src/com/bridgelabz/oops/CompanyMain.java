package com.bridgelabz.oops;

import java.util.Scanner;

public class CompanyMain {
    public static void menuchoose(Company emplyeedetil) {
        Scanner scanner = new Scanner(System.in);
        int chooseNumber;
        do {
            System.out.println("1. addDetails of employee");
            chooseNumber = scanner.nextInt();

            switch (chooseNumber) {
                case 1:
                    System.out.println("add Employee details");
                    emplyeedetil.addEmployee();
                    break;
                case 2:
                    System.out.println("to display detail of employee press 2");
                    emplyeedetil.displayEmployee();

                case 3:
                    System.out.println("add employee in company");
                    emplyeedetil.bigBazar();
                    break;
                case 4:
                    System.out.println("add employee in company");
                    emplyeedetil.jioMart();
                    break;
                case 5:
                    System.out.println("add multiple companies");
                    emplyeedetil.addMutiplecompanies();

            }
        }
        while (chooseNumber != 5);
    }

    public static void main(String[] args) {

        System.out.println("welcome to oops");
        Company company = new Company();
        menuchoose(company);
    }
}

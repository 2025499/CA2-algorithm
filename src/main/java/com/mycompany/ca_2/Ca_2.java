/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ca_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author wanghuohuo
 */

    //Main class to run employee management system

public class Ca_2 {
    // Store all employee data
    public static List<Employee> employeeList = new ArrayList<>();
    // User input scanner
    public static Scanner scanner = new Scanner(System.in);

    
    
    public static void main(String[] args) {
        showMainMenu();
    }

   
      //Display main function menu and handle user selection loop
     
    public static void showMainMenu() {
        int userChoice;
        do {
            System.out.println("\n===== BANK EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Sort employee records");
            System.out.println("2. Search employee by name");
            System.out.println("3. Add new employee information");
            System.out.println("4. Construct employee binary tree");
            System.out.println("5. Exit system");
            System.out.print("Enter your option number: ");
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("System closed successfully");
                    break;
                default:
                    System.out.println("Wrong input, please enter valid number");
            }
        } while (userChoice != 5);
    }
}

package application;

import model.entities.Client;
import model.entities.Order;

import java.time.LocalDate;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");

        System.out.println("Name:");
        String name = sc.nextLine();

        System.out.println("Email:");
        String email = sc.nextLine();

        System.out.println("Birth date:");
        LocalDate birthDate = LocalDate.parse(sc.nextLine());

        System.out.println("Enter order data");







    }
}

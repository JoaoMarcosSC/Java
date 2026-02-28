package src.exemplo1;

import exemplo1.entities.ContaBancaria;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBancaria cb;

        String deposito;
        double depositoValor;
        String saque;
        double saqueValor;

        System.out.println("Enter account number");
        int nrConta = sc.nextInt();

        System.out.println("Enter account holder");
        String nmConta = sc.next();

        System.out.println("Is theren a initial deposit (y/n)?");
        String valorInicial = sc.next();

        if (valorInicial.equals("y")){

            System.out.println("Enter initial deposit value:");
            double vlSaldo = sc.nextDouble();

            cb = new ContaBancaria(nrConta, nmConta, valorInicial, vlSaldo);
            System.out.println("Account " + cb.getNrConta() + " Holder: " + cb.getNmConta() + " Balance: " + cb.getVlSaldo());
        } else {
            cb = new ContaBancaria(nrConta, nmConta, valorInicial);
            System.out.println("Account " + cb.getNrConta() + " Holder: " + cb.getNmConta() + " Balance: " + cb.getVlSaldo());
        }

        System.out.println("Fazer um depósito? y/n");
        deposito = sc.next();

        if(deposito.equals("y")){
            System.out.println("Enter initial deposit value:");
            depositoValor = sc.nextDouble();
            cb.Deposito(depositoValor);
            System.out.println("Account " + cb.getNrConta() + " Holder: " + cb.getNmConta() + " Balance: " + cb.getVlSaldo());
        }

        System.out.println("Fazer um saque? y/n");
        saque = sc.next();

        if(saque.equals("y")){
            System.out.println("Enter initial deposit value:");
            saqueValor = sc.nextDouble();
            cb.Saque(saqueValor);
            System.out.println("Account " + cb.getNrConta() + " Holder: " + cb.getNmConta() + " Balance: " + cb.getVlSaldo());
        }

    }
}

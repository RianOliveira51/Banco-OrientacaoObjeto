package com.example.banco;

import Entities.Conta;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Scanner;

@SpringBootApplication
public class BancoApplication {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta();
        Date now = new Date(System. currentTimeMillis());
        conta.setDate(now);

        System.out.println("Qual sua conta");
        getAccountNumber(sc, conta);

        System.out.println("What your name");
        getClientName(sc, conta);

        getCal(sc, conta);
        System.out.printf("Account data: ", now);
        System.out.println(conta);

        char resp;
        double depositar;
        double sacar;
        System.out.println("Quer d - depositar ou s - sacar ?");
        resp = sc.next().charAt(0);

        if(resp == 'd'){
            System.out.println("Qual valor a depositar? ");
            depositar = sc.nextDouble();
            conta.depositar(depositar);
            System.out.printf("Updated data: ", now);
            System.out.println(conta);
        }else{
            System.out.println("Qual valor você deseja sacar?");
            sacar = sc.nextDouble();
            conta.sacar(sacar);
            System.out.printf("Updated data: ", now);
            System.out.println(conta);
        }

    }

    private static void getCal(Scanner sc, Conta conta){
        double saldo;
        char resposta;

        System.out.println("Você tem saldo inicial? y ou n");
        resposta = sc.next().charAt(0);
        saldo = 0;
        if(resposta == 'y'){
            System.out.println("Qual o seu saldo inicial?");
            saldo = sc.nextDouble();

        }
        conta.setSaldo(saldo);

    }
    private static void getClientName(Scanner sc, Conta conta) {
        String name;
        name = sc.nextLine();
        conta.setName(name);
    }

    private static void getAccountNumber(Scanner sc, Conta conta) {
        int conta2;
        conta2 = sc.nextInt();
        conta.setConta(conta2);
        sc.nextLine();
    }

}

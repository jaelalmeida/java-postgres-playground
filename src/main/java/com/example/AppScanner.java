package com.example;

import java.util.Scanner;

public class AppScanner {
    public static void main (String[] args){
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        cliente.setNome(scanner.nextLine());

        System.out.println("Digite sua renda: ");
        cliente.setRenda(scanner.nextDouble());
        
        scanner.nextLine();
        System.out.println("Digite seu sexo: ");
        String sexo = scanner.nextLine();
        cliente.setSexo(sexo.charAt(0));

        System.out.println("Digite o ano de nascimento: ");
        cliente.setAnoNascimento(scanner.nextInt());

        System.out.println(cliente);
        System.out.println("Seu nome é: " + cliente.getNome());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano nascimento: " + cliente.getAnoNascimento());
        System.out.println('\n');

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Ana Luisa");
        cliente2.setRenda(1000);
        cliente2.setSexo('J');
        cliente2.setAnoNascimento(1991);
        System.out.println(cliente2);
        System.out.println("Seu nome é: " + cliente2.getNome());
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano nascimento: " + cliente2.getAnoNascimento());


      

    }
}

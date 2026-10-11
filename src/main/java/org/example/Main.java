package org.example;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetShop pet1 = new PetShop();


        System.out.println("Qual é o nome do pet?");
        pet1.nome = scanner.nextLine();

        System.out.println("Qual é a raça:");
        pet1.especie = scanner.nextLine();

        System.out.println("Qual é o peso?");
        pet1.peso = scanner.nextDouble();


    System.out.println("========= FICHA DO PET =========");
        System.out.println("Nome: " + pet1.nome);
        System.out.println("Peso: " + pet1.peso + "kg.");
        System.out.println("Espécie: " + pet1.especie);
        pet1.portePet();
    }

}
package org.example;


import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Pet[] petsCadastrados = new Pet[5];
        int opcao = -1;
        int total = 0;

        Scanner scannerOpcao = new Scanner(System.in);

        while (opcao != 0 ){
            System.out.println("========= FICHA DO PET =========");
            System.out.println("1 - Cadastrar novo pet.");
            System.out.println("2 - Listar pets");
            System.out.println("0 - Sair.");


                opcao = scannerOpcao.nextInt();
                scannerOpcao.nextLine();
            System.out.println("Opção selecionada: " + opcao);
                switch (opcao){
                    case 1:
                        if (total <5){
                            Pet pet1 = new Pet();
                            System.out.println("Qual é o nome do pet?");
                            pet1.nome = scannerOpcao.nextLine();

                            System.out.println("Qual é a raça:");
                            pet1.especie = scannerOpcao.nextLine();

                            System.out.println("Qual é o peso?");
                            pet1.peso = scannerOpcao.nextDouble();
                            scannerOpcao.nextLine();

                            petsCadastrados[total] = pet1;

                            System.out.println("Pet cadastrado. Agora são "+ (total+1) + " pets.");

                            total ++;
                        } else {
                            System.out.println("Limite de 5 pets atingido.");
                        }
                        break;

                    case 2:
                        if (total == 0){
                            System.out.println("Ainda não temos nenhum pet cadastrado.");
                        }else {
                            System.out.println("--- PETS CADASTRADOS ---");

                            for (int i = 0; i<total; i++){
                                System.out.println(petsCadastrados[i].nome + "(" + petsCadastrados[i].especie + ")"
                                        + " - " + petsCadastrados[i].peso + " kg.");

                            }
                        }



                    case 0:
                        System.out.println("Finalizando o sistema. Até a próxima.");

                        break;
                    default:
                        System.out.println("Opção inválida!");

                }


        }
        scannerOpcao.close();


/*
    System.out.println("========= FICHA DO PET =========");
        System.out.println("Nome: " + pet1.nome);
        System.out.println("Peso: " + pet1.peso + "kg.");
        System.out.println("Espécie: " + pet1.especie);
        System.out.println("Porte: " + pet1.portePet());

        System.out.println("--- PETS CADASTRADOS ---");
        System.out.print(petsCadastrados[0].nome + " - " + petsCadastrados[0].peso + " - " + petsCadastrados[0].portePet());*/

    }



}

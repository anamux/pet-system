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
            System.out.println("Para cadastrar um novo pet digite 1. Para sair digite 0.");


                opcao = scannerOpcao.nextInt();
                scannerOpcao.nextLine();
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

//                            System.out.println(petsCadastrados[total].nome);
//                            System.out.println(petsCadastrados[total].especie);
//                            System.out.println(petsCadastrados[total].peso);

                            total ++;
                        } else {
                            System.out.println("Limite de 5 pets atingido.");
                        }
                        break;


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

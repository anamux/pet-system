package org.example;


import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
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
            System.out.println("3 - Buscar pelo nome.");
            System.out.println("4 - Listagem de espécies.");
            System.out.println("0 - Sair.");


                opcao = scannerOpcao.nextInt();
                scannerOpcao.nextLine();
            System.out.println("Opção selecionada: " + opcao);

            try {
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
                        break;

                    case 3:
                        System.out.println("Digite o nome que deseja buscar: ");
                        String busca = scannerOpcao.nextLine();
                        boolean achou = false;
                        for (int i = 0; i<total; i++) {
                            if (petsCadastrados[i].nome.equalsIgnoreCase(busca)){

                                System.out.println(petsCadastrados[i].nome + "(" + petsCadastrados[i].especie + ")"
                                        + " - " + petsCadastrados[i].peso + " kg.");
                                achou = true;

                            }

                            if (!achou){
                                System.out.println("Pet não encontrado nos registros.");
                            }

                        }
                        break;

                    case 4:
                        HashSet<String> especies = new HashSet<>();
                        for (int i = 0; i< total; i++){
                            especies.add(petsCadastrados[i].especie);
                        }
                        for (String especie : especies){
                            System.out.println(especie);
                        }
                        System.out.println(especies.size());
                        break;

                    case 0:
                        System.out.println("Finalizando o sistema. Até a próxima.");

                        break;
                    default:
                        System.out.println("Opção inválida!");

                }

            } catch (InputMismatchException e){
                System.out.println("Digite apenas números!");
                scannerOpcao.nextLine();
            }


        }
        scannerOpcao.close();

    }



}

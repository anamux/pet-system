package org.example;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        Pet[] petsCadastrados = new Pet[5];
        ArrayDeque<String> filaBanho = new ArrayDeque<>();
        int opcao = -1;
        int total = 0;

        Scanner scannerOpcao = new Scanner(System.in);
        Agendamento agendamento = Agendamento.builder()
                .nomePet("Thor")
                .servico("banho")
                .horario("14h")
                .perfume(true)
                .laco(false)
                .hidratacao(false)
                .observacao("Alergico a shampoo")
                .desconto("10% de desconto")
                .build();

        System.out.println(agendamento);


        ///criar classe fila, classe listar, etc
       /* while (opcao != 0 ){
            System.out.println("========= FICHA DO PET =========");
            System.out.println("1 - Cadastrar novo pet.");
            System.out.println("2 - Listar pets.");
            System.out.println("3 - Buscar pelo nome.");
            System.out.println("4 - Listagem de espécies.");
            System.out.println("5 - Entrar na Fila do Banho.");
            System.out.println("6 - Atender o próximo.");
            System.out.println("7 - Status de serviço:");
            System.out.println("0 - Sair.");

            opcao = scannerOpcao.nextInt();
                scannerOpcao.nextLine();
            System.out.println("Opção selecionada: " + opcao);

            try {
                switch (opcao) {
                    case 1:
                        if (total < 5) {
                            Pet pet1;
                            System.out.println("Qual é o nome do pet?");
                            String nome = scannerOpcao.nextLine();

                            System.out.println("Qual é a raça:");
                            String especie = scannerOpcao.nextLine();

                            if (especie.equalsIgnoreCase("cachorro")){
                                pet1 = new Cachorro();
                            } else if (especie.equalsIgnoreCase("gato")){
                                pet1 = new Gato();
                            } else {
                                pet1 = new Pet();

                            }

                            System.out.println("Qual é o peso?");
                            pet1.peso = scannerOpcao.nextDouble();
                            scannerOpcao.nextLine();

                            petsCadastrados[total] = pet1;

                            System.out.println("Pet cadastrado. Agora são " + (total + 1) + " pets.");

                            total++;
                        } else {
                            System.out.println("Limite de 5 pets atingido.");
                        }
                        break;

                    case 2:
                        if (total == 0) {
                            System.out.println("Ainda não temos nenhum pet cadastrado.");
                        } else {
                            System.out.println("--- PETS CADASTRADOS ---");

                            for (int i = 0; i < total; i++) {
                                System.out.println(petsCadastrados[i].nome + "(" + petsCadastrados[i].especie + ")"
                                        + " - " + petsCadastrados[i].peso + " kg.");

                            }
                        }
                        break;

                    case 3:
                        System.out.println("Digite o nome que deseja buscar: ");
                        String busca = scannerOpcao.nextLine();
                        boolean achou = false;
                        for (int i = 0; i < total; i++) {
                            if (petsCadastrados[i].nome.equalsIgnoreCase(busca)) {

                                System.out.println(petsCadastrados[i].nome + "(" + petsCadastrados[i].especie + ")"
                                        + " - " + petsCadastrados[i].peso + " kg.");
                                achou = true;

                            }

                            if (!achou) {
                                System.out.println("Pet não encontrado nos registros.");
                            }

                        }
                        break;

                    case 4:
                        HashSet<String> especies = new HashSet<>();
                        for (int i = 0; i < total; i++) {
                            especies.add(petsCadastrados[i].especie);
                            if (petsCadastrados[i].especie.equalsIgnoreCase("cachorro")){
                                petsCadastrados[i].emitirSom(petsCadastrados[i].especie);
                            }
                        }
                        for (String especie : especies) {
                            System.out.println(especie);
                        }
                        System.out.println(especies.size());
                        break;

                    case 5:
                        System.out.println("Nome do pet para entrar na fila do banho:");
                        String proximoDoBanho = scannerOpcao.nextLine();
                      boolean cadastrado = false;

                      for (int i = 0; i<total; i++){
                          if (petsCadastrados[i].nome.equalsIgnoreCase(proximoDoBanho)){
                              cadastrado = true;
                              break;
                          }
                    }
                      if (!cadastrado){
                          System.out.println("Pet não encontrado!");
                      }else {
                          filaBanho.add(proximoDoBanho);

                          System.out.println(proximoDoBanho + " entrou na fila do banho.");
                          System.out.println("Fila agora: " + filaBanho);
                      }
                      break;


                    case 6:
                        if (filaBanho.isEmpty()){
                            System.out.println("Não tem nenhum pet aguardando para tomar banho.");
                        } else {
                            System.out.println("Atendendo: " + filaBanho.poll()+ "...");
                            System.out.println("Fila agora: " + filaBanho);
                        }
                        break;

                    case 7:
                        System.out.println("Qual nome do pet que deseja consultar o status?");
                        String petStatus = scannerOpcao.nextLine();

                        ArrayList<Servico> lista = new ArrayList<>();
                        lista.add(new Banho());
                        lista.add(new Tosa());
                        lista.add(new Consulta());

                        for (Servico item: lista){
                            item.executar(petStatus);
                        }

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
        scannerOpcao.close();*/

    }



}

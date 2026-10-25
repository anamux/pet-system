package org.example;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Agendamento {
    String nomePet;
    String servico;
    String horario;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    String observacao;
    String desconto;


    public Agendamento(String nomePet, String servico, String horario, boolean perfume, boolean hidratacao,
                       boolean laco, String observacao, String desconto){
        this.nomePet = nomePet;
        this.servico =servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;

    }

    void mostrar(){
        System.out.println(nomePet + servico + horario + perfume + laco + hidratacao + observacao + desconto);
    }
}

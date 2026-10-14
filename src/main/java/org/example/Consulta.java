package org.example;

import java.sql.SQLOutput;

public class Consulta implements Servico{

    @Override
    public void executar(String nome) {
        System.out.println(nome + " está na consulta.");
    }
}

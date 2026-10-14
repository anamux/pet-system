package org.example;

public class Banho implements Servico {
    @Override
    public void executar(String nome) {
        System.out.println(nome + " está tomando banho.");
    }
}

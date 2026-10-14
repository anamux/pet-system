package org.example;

public class Tosa implements Servico {
    @Override
    public void executar(String nome) {
        System.out.println(nome + " está na tosa.");
    }
}

package org.example;

public class Cachorro extends Pet {
    @Override
    public void emitirSom(String nome) {
        System.out.println(nome + " : Au au au au.");
    }
}

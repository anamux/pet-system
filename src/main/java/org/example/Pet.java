package org.example;

public class Pet {
    String nome;
    String especie;
    double peso;

    String portePet(Double peso) {
        if(peso < 10){
        return  "Pequeno";

        } else if ( peso >10 && peso<25 ){
            return  "Médio";

        } else {
            return  "Grande";

        }
    }

    public void emitirSom(String nome) {
    }
}

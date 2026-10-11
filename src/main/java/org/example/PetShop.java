package org.example;

public class PetShop {
    String nome;
    String especie;
    double peso;

    void portePet() {
        if(peso < 10){
        String porte = "Pequeno";
            System.out.println("Porte: "+ porte);
        } else if ( peso >10 && peso<25 ){
            String porte = "Médio";
            System.out.println("Porte: "+ porte);
        } else {
            String porte = "Grande";
            System.out.println("Porte: "+ porte);
        }
    }
}

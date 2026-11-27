package fr.eni.demo.weakcoupling;

public class Violin implements Instrument {
    public void afficher() {
        System.out.println("Je suis un violon...");
    }
    public void jouer() {
        System.out.println("ZIN ZIN ZIN");
    }
}

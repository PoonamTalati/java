package fr.eni.demo.weakcoupling;



public class DemoApplication {
    public static void main(String[] args) {
        System.out.println("Le pianiste : ");
        Musician pianist = new Musician("The 9th of Beethoven",new Piano());
        pianist.playMusic();

        System.out.println("Le violoniste : ");
        
        Musician violoniste = new  Musician("The 9th of Beethoven",new Violin());
        violoniste.playMusic();

        System.out.println("L'orchestre : ");
        Orchestre orchestre = new Orchestre();
        orchestre.ajout(pianist);
        orchestre.ajout(violoniste);
        orchestre.jouer();
    }
}

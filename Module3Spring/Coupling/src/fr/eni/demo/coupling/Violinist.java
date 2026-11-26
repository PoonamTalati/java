package fr.eni.demo.coupling;


public class Violinist{
    private Violin violon;
    private String morceau;
    
    public Violinist( String morceau) {
        super();
        this.violon = new Violin();
        this.morceau = morceau;
    }
    
    public void jouerMorceau() {
        violon.afficher();
        System.out.println("et je joue le morceau " + morceau);
        violon.jouer();
    }    
}

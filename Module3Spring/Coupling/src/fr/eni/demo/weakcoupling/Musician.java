package fr.eni.demo.weakcoupling;

public class Musician {
    private Instrument Instrument;
    private  String piece;
    public  Musician(String piece, Instrument instrument)  {
            this.Instrument = instrument;
            this.piece = piece;
    }

	public  void  playMusic()  {
    Instrument.afficher();
    System.out.println("and I play the track "+ piece);
    Instrument.jouer();
    }
	
}

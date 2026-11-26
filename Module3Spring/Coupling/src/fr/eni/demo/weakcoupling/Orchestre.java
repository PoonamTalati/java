package fr.eni.demo.weakcoupling;

import java.util.ArrayList;
import java.util.List;

public class Orchestre {
    private List<Musician> listeMusiciens;
    
    public Orchestre() {
        listeMusiciens = new ArrayList<>();
    }
    
    public void ajout(Musician musicien) {
        listeMusiciens.add(musicien);
    }

    public void jouer() {
        for(Musician music: listeMusiciens) {
        	music.playMusic();
            
        }
    }
}
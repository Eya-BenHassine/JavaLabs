package Lab4.Ex1;

import java.util.ArrayList;

public class Gestionnaire_Personne {
    private ArrayList<Personne> liste = new ArrayList<>();

    public void ajouter(Personne p) {
        liste.add(p);
    }

    public void afficherListe() {
        for (Personne p : liste) {
            p.afficher();
        }
    }
}
package Ex1;

public class main {

    public static void main(String[] args) {
        Gestionnaire_Personne g = new Gestionnaire_Personne();

        for (int i = 1; i <= 10; i++) {
            Personne p = new Personne(i, "Nom" + i, "Prenom" + i, 10000000L + i, "Tunis", 100 * i);
            g.ajouter(p);
        }

        g.afficherListe();
    }

}
package Ex1;

public class Personne {
    private float solde;
    private int id;
    private String nom;
    private String prenom;
    private long NCIN;
    private String adresse;

    public Personne() {
        initPersonne();
    }

    public Personne(int id, String nom, String prenom, long NCIN, String adresse, float solde) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.NCIN = NCIN;
        this.adresse = adresse;
        this.solde = solde;
    }

    public void initPersonne() {
        id = 0;
        nom = "";
        prenom = "";
        NCIN = 0;
        adresse = "";
        solde = 0;
    }

    // returns 1 if the person has no data, 0 otherwise
    public int personneVide() {
        if (id == 0 && nom.isEmpty()) return 1;
        return 0;
    }

    public void afficher() {
        System.out.println(id + " | " + nom + " " + prenom + " | CIN: " + NCIN
                + " | " + adresse + " | Solde: " + solde);
    }

    // returns 1 if success, 0 if not enough money
    public int debiter(float valeur) {
        if (valeur > 0 && valeur <= solde) {
            solde -= valeur;
            return 1;
        }
        return 0;
    }

    // returns 1 if success, 0 if invalid value
    public int ajout(float valeur) {
        if (valeur > 0) {
            solde += valeur;
            return 1;
        }
        return 0;
    }

    public float getSolde() { return solde; }
}
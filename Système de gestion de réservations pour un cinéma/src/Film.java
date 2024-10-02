import java.io.Serializable;

public class Film implements Serializable {
    private String nom_film;
    private Realisateur realisateur;
    private int annee_sortie;
    private String categorie;

    public Film(String nom_film, Realisateur realisateur, int annee_sortie, String categorie) {
        this.nom_film = nom_film;
        this.realisateur = realisateur;
        this.annee_sortie = annee_sortie;
        this.categorie = categorie;
    }


    public String getNom_film() {
        return nom_film;
    }


    public int getAnnee_sortie() {
        return annee_sortie;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setNom_film(String nom_film) {
        this.nom_film = nom_film;
    }

    public void setAnnee_sortie(int annee_sortie) {
        this.annee_sortie = annee_sortie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Film{" +
                "nom_film='" + nom_film + '\'' +
                ", realisateur='" + realisateur + '\'' +
                ", annee_sortie=" + annee_sortie +
                ", categorie='" + categorie + '\'' +
                '}';
    }
}



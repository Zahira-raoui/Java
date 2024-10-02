import java.io.Serializable;

public class Realisateur implements Serializable {

    private String nom;
    private int anneePremiereProduction;


    public Realisateur(String nom, int anneePremiereProduction) {
        this.nom = nom;
        this.anneePremiereProduction = anneePremiereProduction;

    }

    @Override
    public String toString() {
        return "Realisateur{" +
                "nom='" + nom + '\'' +
                ", anneePremiereProduction=" + anneePremiereProduction +

                '}';
    }
}

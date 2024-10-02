// Déclaration d'une classe finale, qui ne peut pas être héritée
public final class MaClasseFinale {

    // Déclaration d'un attribut final
    // Une fois initialisé, cet attribut ne peut pas être modifié
    private final int monAttributFinal;


    // Constructeur de la classe
    public MaClasseFinale(int valeur) {
        this.monAttributFinal = valeur; // Initialisation de l'attribut final
    }

    // Méthode finale, qui ne peut pas être redéfinie par une sous-classe
    public final void afficherMessage() {
        System.out.println("Ceci est une méthode finale.");
    }

    // Getter pour l'attribut final
    public int getMonAttributFinal() {
        return monAttributFinal;
    }

    public static void main(String[] args) {
        // Instanciation de la classe finale
        MaClasseFinale objet = new MaClasseFinale(10);

        // Appel de la méthode finale
        objet.afficherMessage();

        // Affichage de l'attribut final
        System.out.println("Valeur de l'attribut final : " + objet.getMonAttributFinal());
    }
}

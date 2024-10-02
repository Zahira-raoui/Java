// Classe enfant Etudiant qui hérite de Personne
public class Etudiant extends Personne {

    // Attribut spécifique à l'étudiant
    private String numeroEtudiant;

    // Constructeur
    public Etudiant(String nom, int age, String numeroEtudiant) {
        // Appel au constructeur de la classe parent
        super(nom, age);
        this.numeroEtudiant = numeroEtudiant;
    }

    // Redéfinition (Override) de la méthode afficherInformations
    @Override
    public void afficherInformations() {
        // On peut toujours appeler la version parentale si nécessaire
        super.afficherInformations(); // Appel à la méthode de Personne
        System.out.println("Numéro d'étudiant : " + numeroEtudiant);
    }

    // Redéfinition (Override) de la méthode saluer
    @Override
    public void saluer() {
        System.out.println("Bonjour, je suis un étudiant.");
    }

    // Surcharge (Overloading) de la méthode saluer avec des paramètres
    public void saluer(String message) {
        System.out.println(message + ", je suis un étudiant.");
    }

    // Surcharge de la méthode saluer avec un autre type de paramètre
    public void saluer(int nombreFois) {
        for (int i = 0; i < nombreFois; i++) {
            System.out.println("Salut !");
        }
    }
}
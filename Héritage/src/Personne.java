// Classe parent Personne
public class Personne {

    // Attributs
    protected String nom;
    protected int age;

    // Constructeur
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Méthode pour afficher les informations
    public void afficherInformations() {
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
    }

    // Méthode pour saluer
    public void saluer() {
        System.out.println("Bonjour, je suis une personne.");
    }
}

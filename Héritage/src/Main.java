
public class Main {
    public static void main(String[] args) {
        // Création d'une personne
        Personne personne = new Personne("Zahira", 22);
        personne.afficherInformations();
        personne.saluer();

        // Création d'un étudiant
        Etudiant etudiant = new Etudiant("Imane", 22, "E123456");
        etudiant.afficherInformations();  // Redéfinition de la méthode
        etudiant.saluer();                // Redéfinition de la méthode

        // Appel de la surcharge
        etudiant.saluer("Bonjour tout le monde");  // Surcharge avec un String
        etudiant.saluer(3);                        // Surcharge avec un entier
    }

}
// Classe abstraite Animal
abstract class Animal {
    // Attribut commun à tous les animaux
    protected String nom;

    // Constructeur de la classe abstraite
    public Animal(String nom) {
        this.nom = nom;
    }

    // Méthode normale (avec implémentation)
    public void manger() {
        System.out.println(nom + " est en train de manger.");
    }

    // Méthode abstraite (sans implémentation)
    public abstract void faireDuBruit();
}

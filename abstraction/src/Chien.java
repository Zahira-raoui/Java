// Classe concrète Chien qui hérite de la classe abstraite Animal
class Chien extends Animal {
    // Constructeur
    public Chien(String nom) {
        super(nom);
    }

    // Implémentation de la méthode abstraite
    @Override
    public void faireDuBruit() {
        System.out.println(nom + " aboie.");
    }
}

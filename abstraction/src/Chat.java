// Classe concrète Chat qui hérite de la classe abstraite Animal
class Chat extends Animal {
    // Constructeur
    public Chat(String nom) {
        super(nom);
    }

    // Implémentation de la méthode abstraite
    @Override
    public void faireDuBruit() {
        System.out.println(nom + " miaule.");
    }
}
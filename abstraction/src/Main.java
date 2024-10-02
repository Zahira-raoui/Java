
public class Main {
    public static void main(String[] args) {
        // Créer un chien et un chat
        Animal chien = new Chien("Rex");
        Animal chat = new Chat("Minou");

        // Appeler des méthodes sur le chien et le chat
        chien.manger();           // Méthode normale
        chien.faireDuBruit();      // Méthode abstraite implémentée

        chat.manger();             // Méthode normale
        chat.faireDuBruit();       // Méthode abstraite implémentée
    }
}
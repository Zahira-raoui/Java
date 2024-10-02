public class Main {
    public static void main(String[] args) {
        // Création du magasin
        Magasin magasin = new Magasin();

        // Création de produits
        Produit p1 = new Produit("Télévision", 499.99, 10);
        Produit p2 = new Produit("Ordinateur portable", 899.99, 5);
        Produit p3 = new Produit("Smartphone", 299.99, 20);

        // Ajout des produits au stock
        magasin.ajouterProduit(p1);
        magasin.ajouterProduit(p2);
        magasin.ajouterProduit(p3);

        // Affichage du stock initial
        magasin.afficherStock();

        // Vérification si le magasin contient un produit
        System.out.println("Le magasin contient un ordinateur portable ? " + magasin.contientProduit("Ordinateur portable")); // Utilisation de contains()

        // Supprimer un produit du stock
        magasin.supprimerProduit("Smartphone");

        // Affichage du stock après les modifications
        magasin.afficherStock();
    }
}
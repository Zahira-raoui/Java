import java.util.ArrayList;

public class Magasin {
    private ArrayList<Produit> stock;

    // Constructeur
    public Magasin() {
        stock = new ArrayList<>();
    }

    // Méthode pour ajouter un produit au stock
    public void ajouterProduit(Produit produit) {
        stock.add(produit); // Utilisation de add()
        System.out.println(produit.getNom() + " a été ajouté au stock.");
    }

    // Méthode pour supprimer un produit du stock
    public void supprimerProduit(String nom) {
        Produit produit = rechercherProduit(nom);
        if (produit != null) {
            stock.remove(produit); // Utilisation de remove()
            System.out.println(produit.getNom() + " a été retiré du stock.");
        }
    }

    // Méthode pour vérifier si le stock est vide
    public boolean estVide() {
        return stock.isEmpty(); // Utilisation de isEmpty()
    }

    // Méthode pour afficher tous les produits en stock
    public void afficherStock() {
        if (estVide()) {
            System.out.println("Le stock est vide."); // Vérification avec isEmpty()
        } else {
            System.out.println("Stock du magasin (" + stock.size() + " produit(s)) :"); // Utilisation de size()
            for (Produit produit : stock) {
                produit.afficherInfo();
            }
        }
    }

    // Méthode pour rechercher un produit par son nom
    public Produit rechercherProduit(String nom) {
        for (Produit produit : stock) {
            if (produit.getNom().equalsIgnoreCase(nom)) {
                return produit;
            }
        }
        System.out.println("Produit " + nom + " non trouvé dans le stock.");
        return null;
    }

    // Méthode pour vérifier si un produit existe dans le stock
    public boolean contientProduit(String nom) {
        for (Produit produit : stock) {
            if (produit.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }
}
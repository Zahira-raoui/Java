class Produit {
    private String nom;
    private double prix;
    private int quantite;

    // Constructeur
    public Produit(String nom, double prix, int quantite) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    // Méthode pour afficher les informations du produit
    public void afficherInfo() {
        System.out.println("Nom: " + nom + ", Prix: " + prix + " DH, Quantité en stock: " + quantite);
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    // Méthode pour augmenter la quantité de stock
    public void ajouterQuantite(int qte) {
        this.quantite += qte;
    }

    // Méthode pour réduire la quantité de stock
    public void reduireQuantite(int qte) {
        if (this.quantite >= qte) {
            this.quantite -= qte;
        } else {
            System.out.println("Quantité insuffisante en stock pour " + nom);
        }
    }
}

public class ExempleException {

    public static void main(String[] args) {
        // Déclaration des variables
        int numerateur = 10;
        int denominateur = 0;
        int resultat;

        try {
            // Tentative de division par zéro
            resultat = numerateur / denominateur;
            System.out.println("Résultat : " + resultat);
        } catch (ArithmeticException e) {
            // Bloc exécuté en cas de division par zéro
            System.out.println("Erreur : Division par zéro n'est pas permise.");
            System.out.println("Message d'erreur : " + e.getMessage());
        } finally {
            // Bloc finally toujours exécuté, qu'il y ait une exception ou non
            System.out.println("Bloc finally exécuté.");
        }

        // Programme continue ici, même si une exception a été levée
        System.out.println("Fin du programme.");
    }
}

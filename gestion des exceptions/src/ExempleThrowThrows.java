public class ExempleThrowThrows {

   // throw : Utilisé pour lancer explicitement une exception dans le corps d'une méthode.
   // throws : Utilisé dans la signature d'une méthode pour déclarer qu'une méthode peut potentiellement lancer une ou plusieurs exceptions.

    // Méthode qui déclare qu'elle peut lancer une exception de type Exception
    public static void verifierAge(int age) throws Exception {
        if (age < 18) {
            // Utilisation de throw pour lancer une exception
            throw new Exception("L'âge doit être au moins 18 ans pour continuer.");
        } else {
            System.out.println("Accès autorisé. Votre âge est " + age + ".");
        }
    }

    public static void main(String[] args) {
        try {
            // Appel de la méthode qui peut lancer une exception
            verifierAge(16); // Cela va déclencher une exception car l'âge est inférieur à 18
        } catch (Exception e) {
            // Gérer l'exception ici
            System.out.println("Erreur : " + e.getMessage());
        }

        // Essayer avec un âge supérieur à 18
        try {
            verifierAge(20); // Pas d'exception, accès autorisé
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}

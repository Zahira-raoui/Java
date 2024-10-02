import java.util.*;

public class ExempleCollections {

    public static void main(String[] args) {
        // Exemple avec ArrayList
        // ArrayList est une liste dynamique qui permet d'accéder rapidement aux éléments par index
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Pomme");
        arrayList.add("Banane");
        arrayList.add("Orange");

        System.out.println("ArrayList : " + arrayList);
        System.out.println("Premier élément de l'ArrayList : " + arrayList.get(0)); // Accès rapide par index

        // Exemple avec LinkedList
        // LinkedList est une liste chaînée qui permet des insertions/suppressions rapides aux extrémités
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Paris");
        linkedList.add("Londres");
        linkedList.add("Berlin");

        System.out.println("LinkedList : " + linkedList);
        linkedList.addFirst("New York"); // Insertion rapide au début
        System.out.println("LinkedList après ajout en tête : " + linkedList);
        System.out.println("Premier élément de la LinkedList : " + linkedList.get(0));

        // Exemple avec HashSet
        // HashSet ne permet pas de doublons et ne garantit pas l'ordre des éléments
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(5); // Ne sera pas ajouté car HashSet ne permet pas les doublons
        hashSet.add(1);

        System.out.println("HashSet (sans doublons et sans ordre) : " + hashSet);

        // Exemple avec TreeSet
        // TreeSet trie les éléments et ne permet pas les doublons
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(3);
        treeSet.add(15);
        treeSet.add(7);

        System.out.println("TreeSet (trié et sans doublons) : " + treeSet);


        // LinkedHashSet garantit l'ordre d'insertion tout en évitant les doublons
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(30);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30); // Ne sera pas ajouté car déjà présent

        System.out.println("LinkedHashSet (sans doublons et avec ordre d'insertion) : " + linkedHashSet);


        // Exemple avec HashMap
        // HashMap permet de stocker des paires clé-valeur et ne garantit pas l'ordre des éléments
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Math", 90);
        hashMap.put("Physique", 85);
        hashMap.put("Chimie", 92);

        System.out.println("HashMap : " + hashMap);
        System.out.println("Note en Physique : " + hashMap.get("Physique"));

        // LinkedHashMap conserve l'ordre d'insertion des paires clé-valeur
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Rouge", 1);
        linkedHashMap.put("Vert", 2);
        linkedHashMap.put("Bleu", 3);
        linkedHashMap.put("Jaune", 4);

        System.out.println("LinkedHashMap (avec ordre d'insertion) : " + linkedHashMap);
        System.out.println("Valeur associée à 'Vert' dans LinkedHashMap : " + linkedHashMap.get("Vert"));

        // Exemple avec TreeMap
        // TreeMap trie les clés par ordre naturel
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banane", 50);
        treeMap.put("Pomme", 75);
        treeMap.put("Orange", 60);

        System.out.println("TreeMap (trié par clé) : " + treeMap);
    }
}

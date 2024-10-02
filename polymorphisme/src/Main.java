//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           Animal animal = new Animal();
           //La référence animal2 est de type Animal, mais elle contient une instance de Tiger
           Animal animal2 = new Tiger();
           Animal animal3 = new Cat();


        //polymorphism
        Tiger tiger = new Tiger();
        Tiger animal4 = new Cat();


        Cat cat = new Cat();

    }
}
package newStart.OOP.Polymorphism;

public class CheckMain {
    public static void main(String[] args) {
        dog dog1 = new dog();
        dog1.makeSound();
        cat cat1 = new cat();
        cat1.makeSound();
        Animal animal = new dog();
        animal.makeSound();
        feed(animal);
        ((dog)animal).makeSoundTwo();
        animal = new cat();
        animal .makeSound();
        feed(animal);
        ((cat)animal).makeSoundTwo();
    }
    public static void feed(Animal animal){
        if (animal instanceof dog){
            System.out.println("Your Need Food dog");
        }else {
            System.out.println("Your need Food Cat");
        }

    }
}

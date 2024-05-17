package lab7.Animal;

public class TestAnimal{
    public static void main(String[] args) {
        Cat cat1 = new Cat("meo1");
        cat1.greets();
        Dog dog1 = new Dog("cho1");
        Dog dog2 = new Dog("cho2");
        dog1.greets();
        dog1.greets(dog2);
        BigDog bigdog1 = new BigDog("choto1");
        bigdog1.greets();
        bigdog1.greets(dog2);

        Animal dog3 = new Dog("cho3"); // Upcast
        dog3.greets();
        Dog dog4 = (Dog)dog3; // Downcast
        dog4.greets(dog2);
        Animal cat3 = new Cat("meo3"); // Upcast
        cat3.greets();
        
    }
}

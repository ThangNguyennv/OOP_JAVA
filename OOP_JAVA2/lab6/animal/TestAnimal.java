package lab6.animal;

public class TestAnimal {
    public static void main(String[] args){
        Cat cat = new Cat("Con meo");
        System.out.println(cat);
        cat.greets();

        Dog dog1 = new Dog("Con cho1");
        System.out.println(dog1);
        dog1.greets();

        Dog dog2 = new Dog("Con cho2");
        System.out.println(dog2);
        dog1.greets(dog2);
    }
}

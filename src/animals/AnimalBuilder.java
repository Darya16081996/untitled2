package animals;

public class AnimalBuilder {

    public static void print(Animal animal) {
        System.out.println(animal);
    }

    public static void main(String[] args) {

        Animal[] animals = new Animal[]{
                new Cat(1, "Vaska"),
                new Cat(2, "Stepka"),
                new Sphinx("Кот"),
                new Dog("Vaska"),
                new Dog("Stepka"),
                new Parrot("Stop")
        };

        for (Animal animal : animals) {
            if (animal.getClass() == Dog.class) {
                ((Dog) animal).beHappy();
            }
            animal.say();
        }

        Cat cat = new Cat("Vaska");
        print(cat);

        Dog happyDog = new Dog("Rex");
        happyDog.beHappy();

        Animal dog = new Dog("Rex");
        // dog.beHappy(); // не скомпилируется - в классе Animal нет метода beHappy();
        System.out.println(dog.getClass());

        Animal cat1 = new Cat("Murzik");

    }
}

package animals;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    void beHappy() {
        System.out.println("Обожаю хозяина!!!!");
    }

    @Override
    void say() {
        System.out.println("Gaaaaaaaaaaau");
    }

//    @Override
//    public boolean equals(Cat obj) {
//        return false;
//    }
}
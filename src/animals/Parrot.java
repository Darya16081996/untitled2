package animals;

public class Parrot extends Animal {

    public Parrot (String name) {
        super(name);
    }

    @Override
    void say() {

        System.out.println("CHHHH");
    }
}
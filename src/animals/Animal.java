package animals;

public abstract class Animal {
    int id;
    String name;
    int age;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void say();

    //public abstract boolean equals(Cat obj);
}
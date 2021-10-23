package animals;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public Cat(int id, String name) {
        super(id, name);
    }

    @Override
    void say() {
        System.out.println("Meou");
    }

    @Override
    public String toString() {
        return this.name;
    }

//    @Override
//    public boolean equals(Cat obj) {
//        return this.name == obj.name && this.id == obj.id;
//    }
}


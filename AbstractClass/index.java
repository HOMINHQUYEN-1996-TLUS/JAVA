public class index {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.show();

        Cat c1 = new Cat();
        c1.show();
    }
}

abstract class Animal {
    Animal() {
        System.out.println("Animal");
    }

    abstract void show();

    static void sound() {
        System.out.println("Alo Alo");
    }
}

class Dog extends Animal {
    @Override
    void show() {
        System.out.println("Dog");
    }
}

class Cat extends Animal {
    @Override
    void show() {
        System.out.println("Cat");
    }
}
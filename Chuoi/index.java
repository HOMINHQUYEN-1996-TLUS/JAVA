import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class index {
    public static void main(String[] args) {
        try {
            Dog d1 = new Dog();
            Class obj = d1.getClass();
            Method[] methods = obj.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println("Method name  = " + m.getName());
                System.out.println("Type " + m.getReturnType());
            }

            Class obj2 = d1.getClass();
            Constructor[] constructors = obj2.getDeclaredConstructors();
            for (Constructor a : constructors) {
                System.out.println("Contructor name = " + a.getName());
                System.out.println("So prameter = " + a.getParameterCount());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Animal {

}

class Dog extends Animal {
    public String name;

    public void show() {
        System.out.println("I'm Show");
    }

    private void display() {
        System.out.println("I'm display");
    }

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }
}k
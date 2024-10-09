class entity {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Encp {
    public static void main(String[] args) {
        entity entity1 = new entity();
        entity1.name = "Omprakash";
        entity1.age = 23;

        entity1.printInfo(entity1.age);
    }
}

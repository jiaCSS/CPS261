import java.io.Serializable;

public class Person implements Serializable {
    int age;
    String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {

        return "[" + "***Name: " + name +"]" + "\n[" + "***Age: " + age + "]";

    }

}
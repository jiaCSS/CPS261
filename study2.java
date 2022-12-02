import java.io.*;
import java.util.*;

public class study2 implements Serializable {

    String filename;
    ObjectInputStream ois = null;
    ObjectOutputStream oos = null;
    static Scanner kbInput = new Scanner(System.in);

    // construct
    public study2(String filename) {
        this.filename = filename;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
    }

    public void add() {

        try {
            System.out.println("Please enter name: ");
            String name = kbInput.nextLine();

            System.out.println("Please enter age: ");
            int age = kbInput.nextInt();

            Person person = new Person(name, age);
//            System.out.println(person);
            FileOutputStream fileout = new FileOutputStream("person.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fileout);
            oos.writeObject(person);
            oos.close();
            fileout.close();

        } catch (IOException e) {

            System.out.println("Error: write in to file" + e);

        }

    }

    public void display() {


        try {

            FileInputStream filein = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(filein);
            Person person = (Person) ois.readObject();
            System.out.println(person);
            filein.close();
            ois.close();


        } catch (IOException e) {

            System.out.println("Error: Reading error" + e);

        } catch (ClassNotFoundException e) {

            System.out.println("Error: class not found" + e);
        }


    }

    public static void main(String[] args) {

        System.out.println("hello");
        study2 test = new study2("person.ser");

        try {
            int option = -1;
            while (option != 0) {
                System.out.println("Please choose an option:");
                System.out.println("0: quit");
                System.out.println("1: add");
                System.out.println("2: display");
                option = kbInput.nextInt();
                kbInput.nextLine();
                switch (option) {
                    case 0:
                        System.out.println("Bye");
                        break;
                    case 1:
                        test.add();// this cannot invoke?
                    case 2:
                        test.display();// this too;
                }

            }
        } finally {
            try {
                test.ois.close();
                test.oos.close();
            } catch (IOException e) {
                System.out.println("Error: closing file error");
            }

        }

    }

}

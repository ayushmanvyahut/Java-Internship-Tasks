import java.io.*;

// Student class implementing Serializable
class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {

        try {
            // Serialization
            Student student1 = new Student("Ayushman", 101);

            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("student.dat"));

            out.writeObject(student1);
            out.close();

            System.out.println("Student object serialized successfully.");

            // Deserialization
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("student.dat"));

            Student student2 = (Student) in.readObject();
            in.close();

            System.out.println("Student object deserialized successfully.");
            System.out.println("Name: " + student2.name);
            System.out.println("ID: " + student2.id);

        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
package JavaCore.Lesson_19_IO.task2;

import java.io.*;
import java.util.Collection;

public class Methods<T extends Employee & Collection<Employee>>{

    public static <T> void serialize(T employee, File file) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(employee);
            System.out.println("success");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static <T> T deserialize(File file) {
        T employee = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            employee = (T) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employee;
    }
}

package JavaCore.Lesson_19_IO.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {

        String data = "";

        try (InputStream inputStream = new FileInputStream("C:\\Users\\38068" +
                "\\IdeaProjects\\Studies_1\\src\\JavaCore" +
                "\\Lesson_19_IO\\task1\\Input.txt")) {

            while (inputStream.available() > 0) {
                data += (char) inputStream.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        List<Person> people = new ArrayList<>();

        for (String line : data.split("\n")) {
            String[] elements = line.split(",");
            Person person = new Person(elements[0].trim(), Integer.parseInt(elements[1].trim()));
            people.add(person);
        }

        System.out.println(people);

        File file = new File("C:\\Users\\38068" +
                "\\IdeaProjects\\Studies_1\\src\\JavaCore" +
                "\\Lesson_19_IO\\task1\\Output.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (OutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(people.toString().getBytes());
        } catch (IOException e) {
            e.getMessage();
        }
    }




}

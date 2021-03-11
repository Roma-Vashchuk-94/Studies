package JavaCore.Lesson_11_RegEx.task3;

public class StringTest {

    public static void main(String[] args) {

        String str = "I love Java more than my friend. Java is so beautiful.";
        System.out.println(str.contains("Java"));
        System.out.println(str.replaceFirst("Java", "C#"));
        System.out.println(str.replaceAll("Java", "C#"));

    }
}

package JavaCore.Lesson_10_String.task1;

public class StringTest {
    public static void main(String[] args) {
        String str = "I like Java !!!";
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        int index = str.indexOf("Java");
        System.out.println(str.substring(index, index + "Java".length()));
    }
}

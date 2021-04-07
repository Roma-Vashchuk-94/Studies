package JavaCore.Lesson_22_Lambda.task3;


import java.util.Arrays;

public class MyInterfaceTest {
    public static void main(String[] args) {

        MyInterface maxValue = (a, b, c) -> {
            int[] values = new int[] {a, b, c};
            Arrays.sort(values);
            return values[values.length - 1];
            };

        MyInterface averageValue = ((a, b, c) -> {
            int[] values = new int[] {a, b, c};
            Arrays.sort(values);
            return values[1];
        });

        MyInterface sum = ((a, b, c) -> a + b + c);

        System.out.println(maxValue.getNumber(2, 5, 10));
        System.out.println(averageValue.getNumber(5, 3, 9));
        System.out.println(sum.getNumber(3, 6, 1));
    }
}

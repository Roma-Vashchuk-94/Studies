package JavaCore.Lesson_2_VariableWrappersJVM;

import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[5][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (-2 + Math.random() * 77);
            }
        }
    }
}

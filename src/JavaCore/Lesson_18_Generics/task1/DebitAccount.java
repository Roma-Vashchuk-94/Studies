package JavaCore.Lesson_18_Generics.task1;

public class DebitAccount extends Account<Integer>{

    public DebitAccount(Integer id, int sum) {
        super(id, sum);
    }
}

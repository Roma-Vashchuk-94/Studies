package JavaCore.Lesson_18_Generics.task1;

public class CreditAccount extends Account<String> {

    public CreditAccount(String id, int sum) {
        super(id, sum);
    }
}

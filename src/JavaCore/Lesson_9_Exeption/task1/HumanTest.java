package JavaCore.Lesson_9_Exeption.task1;

public class HumanTest {
    public static void main(String[] args) throws IncorrectEmailException, UnderAgeException {
        Human human = new Human("FDf", 19, "dfdf");
        chekForNextStep(human);
    }

    public static void chekForNextStep(Human human) throws IncorrectEmailException, UnderAgeException {
        if (!human.isAdult()) {
            throw new UnderAgeException();
        }
        if (!human.isCorrectEmail()) {
            throw new IncorrectEmailException();
        }
    }
}

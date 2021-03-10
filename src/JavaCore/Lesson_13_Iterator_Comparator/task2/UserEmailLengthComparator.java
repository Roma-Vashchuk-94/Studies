package JavaCore.Lesson_13_Iterator_Comparator.task2;

import java.util.Comparator;

public class UserEmailLengthComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getEmail().length() - o2.getEmail().length();
    }
}

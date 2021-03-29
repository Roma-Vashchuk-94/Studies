package JavaCore.Lesson_13_Iterator_Comparator.task2;

import JavaCore.Lesson_2_VariableWrappersJVM.Array;

import java.util.*;

public class UserTest {


    public static void main(String[] args) {
        Comparator<User> userEmailLengthComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getEmail().length() - o2.getEmail().length();
            }
        };

        User user1 = new User("Adam", 22, "adem2002@gmail.com");
        User user2 = new User("Adam", 22, "adam22@gmail.com");
        User user3 = new User("Emil", 22, "emil123@gmail.com");
        User user4 = new User("Adam", 23, "adam12345@gmail.com");

        List<User> userList = Arrays.asList(user1, user2, user3, user4);
        System.out.println(userList);
        Collections.sort(userList);
        System.out.println(userList);
        Collections.sort(userList, userEmailLengthComparator);
        System.out.println(userList);

    }
}

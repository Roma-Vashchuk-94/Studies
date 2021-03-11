package JavaCore.Lesson_13_Iterator_Comparator.task2;

import JavaCore.Lesson_2_VariableWrappersJVM.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserTest {

    public static void main(String[] args) {
        User user1 = new User("Adam", 22, "adem2002@gmail.com");
        User user2 = new User("Adam", 22, "adam22@gmail.com");
        User user3 = new User("Emil", 22, "emil123@gmail.com");
        User user4 = new User("Adam", 23, "adam12345@gmail.com");

        List<User> userList = Arrays.asList(user1, user2, user3, user4);
        System.out.println(userList);
        Collections.sort(userList);
        System.out.println(userList);
        Collections.sort(userList, new UserEmailLengthComparator());
        System.out.println(userList);


    }
}

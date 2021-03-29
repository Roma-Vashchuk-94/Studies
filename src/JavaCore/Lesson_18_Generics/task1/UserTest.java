package JavaCore.Lesson_18_Generics.task1;

public class UserTest {

    public static void main(String[] args) {
        User user1 = new User("Eddy", 34);
        Account user1DebitAccount = new DebitAccount(3451, 10000);
        User user2 = new User("Jerry", 30);
        Account user2DebitAccount = new DebitAccount(33221, 370000);
        User user3 = new User("Tom", 55);
        Account user3CreditAccount = new CreditAccount("66563", 340000);

        UserService<Account, User> userService = new UserService<>();
        userService.addPerson(user1, user1DebitAccount);
        userService.addPerson(user2, user2DebitAccount);
        userService.addPerson(user3, user3CreditAccount);

        userService.printUsers();
        userService.printAccounts();
        System.out.println(userService.getCharge(user1));
        System.out.println(userService.getCharge(user2));
    }
}


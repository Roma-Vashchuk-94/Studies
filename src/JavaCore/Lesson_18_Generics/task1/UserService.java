package JavaCore.Lesson_18_Generics.task1;

import java.util.*;

public class UserService<T extends Account, K extends User> {

    private Map<K, T> usersAccounts = new TreeMap<>();

    public UserService() {
    }

    public UserService(Map<K, T> usersAccounts) {
        this.usersAccounts = usersAccounts;
    }

    public Map<K, T> getUsersAccounts() {
        return usersAccounts;
    }

    public void setUsersAccounts(Map<K, T> usersAccounts) {
        this.usersAccounts = usersAccounts;
    }

    public void addPerson(K person, T account) {
        usersAccounts.put(person, account);
    }

    public void printUsers() {
        System.out.println("Print all users:");
        Set<K> users = usersAccounts.keySet();
        for (K user : users) {
            System.out.println(user);
        }
    }

    public void printAccounts() {
        System.out.println("Print all accounts:");
        Collection<T> accounts = usersAccounts.values();
        for (T account : accounts) {
            System.out.println(account);
        }
        System.out.println();
    }

    public double getCharge(K user) {
        if (usersAccounts.containsKey(user)) {
            System.out.println("Calculate charge for " + user);
            return usersAccounts.get(user).getSum() * 0.05;
        } else {
            return 0;
        }
    }
}

package JavaCore.Lesson_15_Map.task2;

import JavaCore.Lesson_15_Map.task1.Account;
import JavaCore.Lesson_15_Map.task1.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AuthorsProcessor {

    private Map<Person, List<Account>> authors;

    public AuthorsProcessor(Map<Person, List<Account>> authors) {
        this.authors = authors;
    }

    public Map<Person, List<Account>> getAuthors() {
        return authors;
    }

    public void setAuthors(Map<Person, List<Account>> authors) {
        this.authors = authors;
    }

    public void addAuthor(Person person) {
        authors.put(person, new ArrayList<>());
    }

    public void addAuthor(Person person, List<Account> listAccount) {
        authors.put(person, listAccount);
    }

    public void removeAuthor(Person person) {
        authors.remove(person);
    }

    public void addAuthorAccount(Person person, Account account) {
        List<Account> list = authors.get(person);
        list.add(account);
        authors.put(person, list);
    }

    public void removeAuthorAccount(Person person, Account account) {
        List<Account> list = authors.get(person);
        list.remove(account);
        authors.put(person, list);
    }

    public void printAuthors() {
        for (Map.Entry<Person, List<Account>> entry : authors.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }
    }


}

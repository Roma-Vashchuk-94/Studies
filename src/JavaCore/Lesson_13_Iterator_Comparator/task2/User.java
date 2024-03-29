package JavaCore.Lesson_13_Iterator_Comparator.task2;

import java.util.Comparator;
import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

    @Override
    public int compareTo(User o) {
        if (this.name.compareTo(o.name) != 0) {
            return this.name.compareTo(o.name);
        } else if (this.age != o.age) {
            return this.age - o.age;
        } else {
            return this.email.compareTo(o.email);
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.email;
    }

}

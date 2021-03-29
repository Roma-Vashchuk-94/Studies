package JavaCore.Lesson_18_Generics.task1;

public class User implements Comparable<User> {

    private String userName;
    private int age;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "userName='" + userName + '\'' + ", age=" + age + '}';
    }

    @Override
    public int compareTo(User o) {
        if (this.userName.compareTo(o.getUserName()) == 0) {
            return this.age - o.getAge();
        } else {
            return this.userName.compareTo(o.getUserName());
        }
    }
}

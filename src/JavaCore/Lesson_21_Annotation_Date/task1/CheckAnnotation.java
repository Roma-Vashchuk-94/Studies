package JavaCore.Lesson_21_Annotation_Date.task1;

public class CheckAnnotation {

    @MyAnnotation(name = "Elisabet")
    private String name;

    public CheckAnnotation(String name) {
        this.name = name;
    }

    @MyAnnotation(name = "Elisabet")
    public String getName() {
        return name;
    }

    @MyAnnotation(name = "Elisabet")
    public void setName(String name) {
        this.name = name;
    }

    @MyAnnotation(name = "Elisabet")
    public void printName() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "CheckAnnotation{" + "name='" + name + '\'' + '}';
    }
}

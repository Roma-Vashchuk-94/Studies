package JavaCore.Lesson_21_Annotation_Date.task2;

public class Cat {

    @AuthorAnnotation(authorName = "Roman Vashchuk")
    private String catBreed;


    private String catName;

    @AuthorAnnotation(authorName = "Roman Vashchuk")
    private int catAge;

    public Cat(String catBreed, String catName, int catAge) {
        this.catBreed = catBreed;
        this.catName = catName;
        this.catAge = catAge;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catBreed='" + catBreed + '\'' +
                ", catName='" + catName + '\'' +
                ", catAge=" + catAge +
                '}';
    }

}

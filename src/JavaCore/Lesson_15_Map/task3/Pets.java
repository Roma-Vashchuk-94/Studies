package JavaCore.Lesson_15_Map.task3;

public enum Pets {
    DOG("Dog"),
    CAT("Cat"),
    FISH("Fish"),
    BIRD("Bird"),
    HAMSTER("Hamster"),
    GUINEA_PIG("Guinea pig"),
    ANT_FARM("Ant farm"),
    LIZARD("Lizard"),
    TURTLE("Turtle"),
    SNAKE("Snake");

    private String type;

    Pets(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}

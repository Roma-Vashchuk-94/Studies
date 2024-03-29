package JavaCore.Lesson_19_IO.task2;

import java.io.Serializable;

public class Position implements Serializable {

    private String position;

    public Position(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return position;
    }
}

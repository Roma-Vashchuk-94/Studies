package JavaCore.Lesson_4_Encapsulation_Inheritance.task3;

public class Wheel {
    private int wheelWidth;
    private int wheelTireProfileHeight;
    private int diameterOfTheSideRing;
    private String season;

    public Wheel(int wheelWidth, int wheelTireProfileHeight, int diameterOfTheSideRing) {
        this.wheelWidth = wheelWidth;
        this.wheelTireProfileHeight = wheelTireProfileHeight;
        this.diameterOfTheSideRing = diameterOfTheSideRing;
        this.season = "Summer";
    }

    public int getWheelWidth() {
        return wheelWidth;
    }

    public void setWheelWidth(int wheelWidth) {
        this.wheelWidth = wheelWidth;
    }

    public int getWheelTireProfileHeight() {
        return wheelTireProfileHeight;
    }

    public void setWheelTireProfileHeight(int wheelTireProfileHeight) {
        this.wheelTireProfileHeight = wheelTireProfileHeight;
    }

    public int getDiameterOfTheSideRing() {
        return diameterOfTheSideRing;
    }

    public void setDiameterOfTheSideRing(int diameterOfTheSideRing) {
        this.diameterOfTheSideRing = diameterOfTheSideRing;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Wheels: " + wheelWidth + "/" + wheelTireProfileHeight + "/R" + diameterOfTheSideRing + "; season: " + season + ".";
    }

    public void changeTheSeason() {
        if (this.season.equals("Summer")) {
            this.season = "Winter";
        } else {
            this.season = "Summer";
        }

    }

    public void installSportsTires() {
        this.wheelWidth = wheelWidth + 10;
        this.wheelTireProfileHeight = wheelTireProfileHeight + 5;
        this.diameterOfTheSideRing = diameterOfTheSideRing + 1;
    }
}

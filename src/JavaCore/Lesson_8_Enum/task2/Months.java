package JavaCore.Lesson_8_Enum.task2;

public enum Months {
    JANUARY(31, Seasons.WINTER),
    FEBRUARY(28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING),
    APRIL(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING),
    JUNE(30, Seasons.SUMMER),
    JULI(31, Seasons.SUMMER),
    AUGUST(31, Seasons.SUMMER),
    SEPTEMBER(30, Seasons.AUTUMN),
    OCTOBER(31, Seasons.AUTUMN),
    NOVEMBER(30, Seasons.AUTUMN),
    DECEMBER(31, Seasons.WINTER);

    private int days;
    private Seasons season;

    Months(int days, Seasons season) {
        this.days = days;
        this.season = season;
    }

    public int getDays() {
        return days;
    }

    public Seasons getSeason() {
        return season;
    }

    public void sameSeason() {
        System.out.println("All months with the same season:");
        for (Months anotherMonth : Months.values()){
            if (!this.name().equals(anotherMonth.name()) && this.getSeason().equals(anotherMonth.getSeason())) {
                System.out.print(anotherMonth.name() + "; ");
            }
        }
        System.out.println();
    }

    public void sameNumberOfDays() {
        System.out.println("All months with the same number of days:");
        int count = 0;
        for (Months anotherMonth : Months.values()){
            if (!this.name().equals(anotherMonth.name()) && this.getDays() == anotherMonth.getDays()) {
                System.out.print(anotherMonth.name() + "; ");
                count++;
            }
        }
        if (count == 0) {
            System.out.print("There are no months with same number of days");
        }
        System.out.println();
    }

    public void fewerDays() {
        System.out.println("All months with the fewer days:");
        int count = 0;
        for (Months anotherMonth : Months.values()){
            if (!this.name().equals(anotherMonth.name()) && this.getDays() > anotherMonth.getDays()) {
                System.out.print(anotherMonth.name() + "; ");
                count++;
            }
        }
        if (count == 0) {
            System.out.print("There are no months with the fewer days");
        }
        System.out.println();
    }

    public void moreDays() {
        System.out.println("All months with the more days:");
        int count = 0;
        for (Months anotherMonth : Months.values()){
            if (!this.name().equals(anotherMonth.name()) && this.getDays() < anotherMonth.getDays()) {
                System.out.print(anotherMonth.name() + "; ");
                count++;
            }
        }
        if (count == 0) {
            System.out.print("There are no months with the more days");
        }
        System.out.println();
    }

    public void nextSeason() {
        String nextSeason = null;
        switch (this.getSeason()) {
            case WINTER:
                nextSeason = Seasons.SPRING.name();
                break;
            case SPRING:
                nextSeason = Seasons.SUMMER.name();
                break;
            case SUMMER:
                nextSeason = Seasons.AUTUMN.name();
                break;
            case AUTUMN:
                nextSeason = Seasons.WINTER.name();
                break;
        }
        System.out.println("Next season is: " + nextSeason);
    }

    public void previousSeason() {
        String previousSeason = null;
        switch (this.getSeason()) {
            case WINTER:
                previousSeason = Seasons.AUTUMN.name();
                break;
            case SPRING:
                previousSeason = Seasons.WINTER.name();
                break;
            case SUMMER:
                previousSeason = Seasons.SPRING.name();
                break;
            case AUTUMN:
                previousSeason = Seasons.SUMMER.name();
                break;
        }
        System.out.println("Previous season is: " + previousSeason);
    }

    public void haveEvenDays() {
        if (this.getDays() % 2 == 0) {
            System.out.println("Month " + this.name() + " has an even number of days");
        } else {
            System.out.println("Month " + this.name() + " has an odd number of days");
        }
    }

    public static void evenDays() {
        System.out.println("All months in year with an even number of days:");
        for (Months month : Months.values()){
            if (month.getDays() % 2 == 0) {
                System.out.print(month.name() + " ");
            }
        }
        System.out.println();
    }

    public static void oddDays() {
        System.out.println("All months in year with an odd number of days:");
        for (Months month : Months.values()){
            if (month.getDays() % 2 != 0) {
                System.out.print(month.name() + " ");
            }
        }
        System.out.println();
    }





}

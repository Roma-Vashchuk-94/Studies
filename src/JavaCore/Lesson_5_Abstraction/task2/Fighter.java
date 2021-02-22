package JavaCore.Lesson_5_Abstraction.task2;

public class Fighter {
    private String name;
    private String weapon;
    private int power;
    private int health;
    private boolean isAlive = true;

    public Fighter(String name, String weapon, int power) {
        this.name = name;
        this.weapon = weapon;
        this.power = power;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Fighter " + name + ": weapon - " + weapon + "; power - " + power + "; health - " + health + ".";
    }

    public void attack(Fighter fighter) {
        System.out.println("Fighter " + name + " attacked" + " fighter " + fighter.name);
        fighter.setHealth(fighter.getHealth() - power);
        if (fighter.getHealth() > 0) {
            System.out.println("Fighter " + fighter.getName() + " still alive, health - " + fighter.getHealth() + ".");
        } else {
            System.out.println("Fighter " + fighter.getName() + " dead");
            fighter.setAlive(false);
        }

    }
}

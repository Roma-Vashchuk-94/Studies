package JavaCore.Lesson_5_Abstraction.task2;

public class Fight {
    public static void main(String[] args) {
        Fighter[] listOfFighters = new Fighter[4];
        listOfFighters[0] = new ClanLinKuei("SubZero", "Ice scepter", 7);
        listOfFighters[1] = new ClanLinKuei("NoobSaibot", "Ninja Sword", 10);
        listOfFighters[2] = new ClanShiraiRyu("Scorpion", "Swear on chains", 9);
        listOfFighters[3] = new ClanShiraiRyu("Takeda Takahashi", "Whips", 6);

        System.out.println("TODAY FIGHTING:\n");

        for (Fighter one : listOfFighters) {
            System.out.println(one.toString());
        }

        System.out.println("\n!!!START FIGHTING!!!\n");

        int fighters = listOfFighters.length;
        while (fighters != 1) {
            int fighter1 = (int)Math.floor(Math.random() * listOfFighters.length);
            int fighter2 = (int)Math.floor(Math.random() * listOfFighters.length);
            if (fighter1 != fighter2 && listOfFighters[fighter1].isAlive() && listOfFighters[fighter2].isAlive()) {
                listOfFighters[fighter1].attack(listOfFighters[fighter2]);
                if (!listOfFighters[fighter2].isAlive()) {
                    fighters--;
                }
            }
        }

        for (Fighter one : listOfFighters) {
            if (one.isAlive()) {
                System.out.println("\n" + one.getName().toUpperCase() + " WIN THE FIGHT!!!");
            }
        }
    }
}

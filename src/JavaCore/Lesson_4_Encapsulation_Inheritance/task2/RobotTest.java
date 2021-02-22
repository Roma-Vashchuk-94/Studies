package JavaCore.Lesson_4_Encapsulation_Inheritance.task2;

public class RobotTest {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.work();
        Robot robotCoocker = new RobotCoocker();
        robotCoocker.work();
        Robot robotDancer = new RobotDancer();
        robotDancer.work();
        Robot coffeRobot = new CoffeRobot();
        coffeRobot.work();
        System.out.println();

        System.out.println("Now elements from array:");

        Robot[] robotsArray = new Robot[4];
        robotsArray[0] = robot;
        robotsArray[1] = robotCoocker;
        robotsArray[2] = robotDancer;
        robotsArray[3] = coffeRobot;

        for (Robot a : robotsArray) {
            a.work();
        }
    }
}

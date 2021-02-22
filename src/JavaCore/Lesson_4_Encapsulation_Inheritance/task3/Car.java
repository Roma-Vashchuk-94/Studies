package JavaCore.Lesson_4_Encapsulation_Inheritance.task3;

public class Car {
    private String model;
    private int maxSpeed;
    private CarBody carBody;
    private Wheel wheel;
    private Helm helm;

    public Car(String model, int maxSpeed, CarBody carBody, Wheel wheel, Helm helm) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.carBody = carBody;
        this.wheel = wheel;
        this.helm = helm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    @Override
    public String toString() {
        return "Model of this car is: " + model + "\nmax speed of this car is: " + maxSpeed + " km/hour\n" + helm.toString() + "\n" + wheel.toString() + "\n" + carBody.toString();
    }
}

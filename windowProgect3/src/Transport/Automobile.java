package Transport;

public class Automobile {
    protected double speed;
    protected double maxSpeed;
    protected double acceleration;
    protected double brakingSpeed;


    public Automobile() {
        acceleration = 30;
        brakingSpeed = 120;
    }

    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        }
        else speed = 0;
    }
}
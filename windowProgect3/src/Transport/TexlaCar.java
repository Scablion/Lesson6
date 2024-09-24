package Transport;

public class TexlaCar extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public TexlaCar() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        }
        else {
            speed = autoPilotMaxSpeed;
        }
    }

    // переопределите метод для ускорения
    @Override
    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        }
        else{
            speed = maxSpeed;
        }
    }


    // переопределите метод для торможения
    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        }
        else speed = 0;

    }

}


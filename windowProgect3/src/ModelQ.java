import Transport.TexlaCar;

public class ModelQ extends TexlaCar {

    public ModelQ() {
        // переопределите необходимые поля
        speed = 0;
        maxSpeed = 300;
        acceleration = 100;
        brakingSpeed = 120;
    }
    double getSpeed(){
        return speed;
    }
    double getMaxSpeed(){
        return maxSpeed;
    }
    double getAcceleration(){
        return speed;
    }
}
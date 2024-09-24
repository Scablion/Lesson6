class Practicum {
    public static void main(String[] args) {
        ModelQ testCar = new ModelQ();

        System.out.println("Характеристики модели:");
        System.out.println("Ускорение: " + testCar.getAcceleration() + " км/(ч*с)");
        System.out.println("Максимальная скорость: " + testCar.getMaxSpeed() + " км/ч");

        System.out.println("\nНачало теста!");

        System.out.println("Едем на автопилоте:");
        for (int second = 0; second < 5; second++) {
            testCar.accelerateByAutopilot();
        }
        System.out.print("Скорость Q спустя 5с на автопилоте: " + testCar.getSpeed() + " км/ч");
        checkResult(55.0, testCar.getSpeed());

        for (int second = 0; second < 5; second++) {
            testCar.accelerateByAutopilot();
        }
        System.out.print("Скорость Q спустя ещё 5с на автопилоте: " + testCar.getSpeed() + " км/ч");
        checkResult(60.0, testCar.getSpeed());


        System.out.println("Переходим в ручной режим:");
        for (int second = 0; second < 2; second++) {
            testCar.accelerate();
        }
        System.out.print("Скорость Q спустя 2с в ручном режиме: " + testCar.getSpeed() + " км/ч");
        checkResult(260.0, testCar.getSpeed());

        for (int second = 0; second < 2; second++) {
            testCar.accelerate();
        }
        System.out.print("Скорость Q спустя ещё 2с в ручном режиме: " + testCar.getSpeed() + " км/ч");
        checkResult(300.0, testCar.getSpeed());


        System.out.println("Проверяем торможение:");
        int brakingTime = 0;
        while (testCar.getSpeed() > 0) {
            testCar.brake();
            brakingTime++;
        }
        System.out.print("Время торможения до полной остановки: " + brakingTime + "c");
        checkResult(3, brakingTime);
        System.out.print("Скорость Q: " + testCar.getSpeed() + " км/ч");
        checkResult(0.0, testCar.getSpeed());
    }

    private static void checkResult(double expect, double actual) {
        if (expect == actual) {
            System.out.println(" ✅");
        } else {
            System.out.println(" ❌");
        }
    }

    private static void checkResult(int expect, int actual) {
        if (expect == actual) {
            System.out.println(" ✅");
        } else {
            System.out.println(" ❌");
        }
    }
}
public class Car extends Vehicle {
    int n = 1;

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
@Override
    public void updateTyre() {
        System.out.println(n + "Колесо - Меняем покрышку");
        n++;
}

@Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

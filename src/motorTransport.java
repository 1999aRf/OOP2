public class motorTransport extends Vehicle{
    public motorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}

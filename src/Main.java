public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);


        Truck truck = new Truck("Truck1", 6);
        Truck truck2 = new Truck("Truck2", 8);


        Bycycle bicycle = new Bycycle("Bicycle1", 2);
        Bycycle bicycle2 = new Bycycle("Bicycle2", 2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}
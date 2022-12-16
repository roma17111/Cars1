package transport;


import java.util.*;

public abstract class Car extends Transport implements Сompeting {

    private double engineVolume;
    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Sponsor<?>> sponsors = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();




    public Car(String brand, String model, double engineVolume){
        super(brand, model);
        setEngineVolume(engineVolume);


    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume < 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addSponsor(Sponsor<?>... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }


    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public static void start() {
        System.out.println("Автомобили начинают движение");
    }

    public static void stop() {
        System.out.println("Автомобили заканчиваютдвижение");
    }

    public abstract void printInfoAboutCars();
    public abstract void race();

    public static void raceStart(Car... cars) {
        double vin = Integer.MIN_VALUE;
        String vinRace = null;
        for (Car car : cars) {
            if (car.getEngineVolume() > vin) {
                vin = car.getEngineVolume();
                vinRace = car.getBrand() + " " + car.getModel();
            }
        }
        System.out.println("Победитель " + vinRace);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        if (sponsors.equals(car.sponsors) || drivers.equals(car.drivers) || mechanics.equals(car.mechanics)) {
            throw new IllegalArgumentException("Никаких повторений");
        }
        return Double.compare(car.engineVolume, engineVolume) == 0 && drivers.equals(car.drivers) &&
                sponsors.equals(car.sponsors) && mechanics.equals(car.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineVolume, drivers, sponsors, mechanics);
    }

    @Override
    public String toString() {
        return "Класс автомобили: " + "\n" +
                "Бренд: " + getBrand() + "\n" +
                "Модель: " + getModel() + "\n" +
                "Обьем двигателя: " + getEngineVolume() + "\n"

                ;
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Sponsor<?>> getSponsors() {
        return sponsors;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public abstract boolean service();



    public static void startService(Car... cars) throws IllegalArgumentException {
        for (int i = 0; i < cars.length; i++) {
            try {
                cars[i].service();
            } catch (IllegalArgumentException e) {
                System.out.println("Транспортное средство " + cars[i].getBrand() + cars[i].getModel() +
                        " непрошло техобслуживание");
            } finally {
                System.out.println("Транспортное средство " + cars[i].getBrand() + cars[i].getModel() +
                        " обслужено");
            }
        }
    }
}


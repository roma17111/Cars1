package transport;


import java.util.Objects;

public class Bus extends Car implements Сompeting {
    public enum Capacity {
        EXTRA_SMALL(0, 10),
        SMALL(0, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        EXTRA_LARGE(100, 120);

        private final int from;
        private final int to;

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }

        Capacity(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    @Override
    public String getModel() {
        return super.getModel().toLowerCase();
    }

    @Override
    public void printInfoAboutCars() {
        if (capacity == null) {
            System.out.println("Неполные данные: ");
        }else {
            System.out.println("Вместимость автобуса: от" + capacity.getFrom() +
                    " до " + capacity.getTo() + " пассажиров");
        }
    }

    @Override
    public void race() {
        System.out.println("Cегодня проходит гонка в классе Автобусов-автомобилей");
        start();
        stop();
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " +
                getModel() + "С обьёмом двигателя " + getEngineVolume()
                + " литров заезжает на пит-стоп. ");
        System.out.println("Пит-стоп окончен");
    }

    @Override
    public void bestTimeOfLap() {
        System.out.println("Автобус"
                + getBrand() + " выезжает из питстопа и" +
                "и заезжает на круг. Лучшее время круга 2 минуты и 56 секунд пока никому не удалось побить");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость на трассе 150 километров в час - это абсолютный рекорд");
    }

    public void addPitstopBus() {
        pitStop();
        bestTimeOfLap();
        maxSpeed();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return capacity == bus.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);
    }

    @Override
    public String toString() {
        return "Автобус: " + "\n" +
                "Бренд: " + getBrand() + "\n" +
                "Модель: " + getModel() + "\n" +
                "Обьем двигателя: " + getEngineVolume() + "\n" +
                "Вместимость пассажиров: от " + capacity.getFrom() + " до " + capacity.to
                ;
    }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrand() + getModel() + " не нуждается в обслуживании");
        return true;
    }
}

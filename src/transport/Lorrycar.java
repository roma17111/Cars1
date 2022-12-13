package transport;

public class Lorrycar extends Car implements Сompeting {


    public enum Weight {
        N1(0D, 3.5D),
        N2(3.5, 12D),
        N3(12D, null);


        private final Double from;
        private final Double to;

        Weight(Double from, Double to) {
            this.from = from;
            this.to = to;
        }

        public Double getFrom() {
            return from;
        }

        public Double getTo() {
            return to;
        }
    }

    private final Weight weight;

    public Lorrycar(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }


    @Override
    public void printInfoAboutCars() {
        if (weight == null) {
            System.out.println("Данных о грузоподьемности недостаточно. ");

        } else {
            String from = weight.getFrom() == null ? "" : " от " + weight.getFrom();
            String to = weight.getFrom() == null ? "" : " до " + weight.getTo();
            System.out.println("Грузоподьёмность трака: " + from + to + "\n");
        }

    }

    @Override
    public void race() {
        System.out.println("Cегодня проходит гонка в классе легковых Грузовых автомобилей");
        start();
        stop();
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик  " + getBrand() + " " +
                getModel() + "С обьёмом двигателя " + getEngineVolume()
                + " литров заезжает на пит-стоп. ");
        System.out.println("Пит-стоп окончен");
    }

    @Override
    public void bestTimeOfLap() {
        System.out.println("грузовик "
                + getBrand() + " выезжает из питстопа и" +
                "и заезжает на круг. Лучшее время круга 3 минуты и 56 секунд пока никому не удалось побить");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость на трассе 120 километров в час - это абсолютный рекорд");
    }

    public void addPitstopLorry() {
        pitStop();
        bestTimeOfLap();
        maxSpeed();
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль: " + "\n" +
                "Бренд: " + getBrand() + "\n" +
                "Модель: " + getModel() + "\n" +
                "Обьем двигателя: " + getEngineVolume() + "\n" +
                "Грузоподьемность: от " + weight.getFrom() + " до " + weight.getTo()
                ;
    }

    @Override
    public boolean service() {
        return Math.random() > 0.8;
    }
}

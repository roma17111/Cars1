package transport;

public class Passengercar extends Car implements Сompeting{

    public enum CarBodyType {

        SEDAN_CAR("Седан"),
        HATCHBACK_CAR("хетчбэк"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV_CAR("Внедорожник"),
        CROSSOVER_CAR("Кроссовер"),
        PICKUP_TRACK_CAR("Пикап"),
        VAN_CAR("Фургон"),
        MINI_VAN_CAR("Минивен");

        private final String bodyType;

        CarBodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return
                    super.toString() +
                            "Тип кузова - " + bodyType
                    ;
        }
    }



    private CarBodyType bodyType;

    public Passengercar(String brand, String model, double engineVolume,CarBodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;

    }

    public CarBodyType getBodyType() {
        return bodyType;
    }

    @Override
    public String getBrand() {
        return super.getBrand().toUpperCase();
    }

    @Override
    public void printInfoAboutCars() {
        if (bodyType == null) {
            System.out.println("Введено некорректное значение");
        }else {
            System.out.println("Тип кузова - " + bodyType.getBodyType());
        }

    }

    @Override
    public void race() {
        System.out.println("Cегодня проходит гонка в классе легковых автомобилей");
        start();
        stop();
    }




    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() +" "+
                getModel() +"С обьёмом двигателя "+getEngineVolume()
                + " литров заезжает на пит-стоп. ");
        System.out.println("Пит-стоп окончен");
    }

    @Override
    public void bestTimeOfLap() {
        System.out.println("Автомобиль"
                + getBrand() + " выезжает из питстопа и" +
                "и заезжает на круг. Лучшее время круга 1 минуту и 5 секунд пока никому не удалось побить");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость на трассе 350 километров в час - это абсолютный рекорд");
    }
    public void addPitstop() {
        pitStop();
        bestTimeOfLap();
        maxSpeed();


    }
    @Override
    public String toString() {
        return "Класс автомобили: " + "\n" +
                "Бренд: " + getBrand() + "\n" +
                "Модель: " + getModel() + "\n" +
                "Обьем двигателя: " + getEngineVolume() + "\n" +
                "Тип кузова: " + getBodyType().bodyType
                ;
    }

    @Override
    public boolean service() {
        return Math.random() > 0.6;
    }


}



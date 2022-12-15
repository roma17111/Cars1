package transport;

import java.util.Random;

public class Sponsor <C extends Car>{
    private final String name;
    private final Integer totalPay;


    public Sponsor(String name, Integer totalPay) {
        this.name = name;
        this.totalPay = totalPay;
    }

    public String getName() {
        return name;
    }

    public Integer getTotalPay() {
        return totalPay;
    }

    public void doSponsored(Car car) {
        System.out.println("Спонсором для автомобиля " + car.getModel() + car.getBrand() + "\n" +
                "является " + name + " он проспонсировал автомобиль на сумму" + totalPay);
    }

}
